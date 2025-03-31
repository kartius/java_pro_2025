package org.lessons.lesson_25_patterns.facade;

public class LaptopFacade {

  private CPU cpu;
  private HardDrive hardDrive;
  private Memory memory;

  public LaptopFacade() {
    this.cpu = new CPU();
    this.hardDrive = new HardDrive();
    this.memory = new Memory();
  }

  public void start() {
    cpu.freeze();
    memory.load(0, hardDrive.read(1000, 2300));
    cpu.jump(0);
    cpu.execute();
  }
}
