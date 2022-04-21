package ar.com.educacionit.enums;

public final class LoggerFactory {
		
	public static ILogger getLoggerFromEdum(LoggersEnum loggerEnum) throws RuntimeException {

		if(loggerEnum == null) {
			throw new RuntimeException("Debe indicar un LoggerEnum Valido");
		}
		
		if(loggerEnum == LoggersEnum.FS){
			//28:58
			return new FSLogger();
		} else {
			return new ConsoleLogger();
		}
	
}

}
