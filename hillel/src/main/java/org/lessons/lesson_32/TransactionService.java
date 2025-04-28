package org.lessons.lesson_32;

import lombok.AllArgsConstructor;
import org.apache.log4j.Logger;

@AllArgsConstructor
public class TransactionService {

  ExternalService externalService;
  final static Logger LOGGER = Logger.getLogger(TransactionService.class);

  public void createTransaction(int amount) {
    LOGGER.info(String.format("Creating transaction with amount %s", amount));
    externalService.emptyMethod();
  }


}
