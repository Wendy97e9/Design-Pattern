package fecadeComputer;

public class Mainframe {
	private Memory mem = new Memory();
	private CPU cpu = new CPU();
	private HardDisk hd = new HardDisk();
	private OS os = new OS();
	public void on()
	{
		mem.check();
		cpu.run();
		hd.read();
		os.load();
	}

}
