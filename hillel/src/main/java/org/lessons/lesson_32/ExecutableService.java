package org.lessons.lesson_32;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import org.apache.log4j.MDC;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
public class ExecutableService {

  private TransactionService transactionService;
  Map<UUID, Integer> map;

  public void execute(int amount, UUID uuid) {
    MDC.put("transaction.uuid", uuid);
    transactionService.createTransaction(amount);
    map.put(uuid, amount);
  }


  public static void main(String[] args) {
    ExecutableService executableService = new ExecutableService(new TransactionService(new ExternalService()), new HashMap<>());
    for (int i = 0; i < 10; i++) {
      executableService.execute(i+1, UUID.randomUUID());
    }
  }
}
