package ejemplo01;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Principal {

	public static void main(String[] args) {

		System.out.println("\t\t---INICIALIZAR Y CREAR FECHAS---\n");

		// Fecha a día de hoy
		LocalDate date1 = LocalDate.now();
		System.out
				.println("Fecha a día de hoy, instanciando la fecha como LocalDate date1 = LocalDate.now();: " + date1);

		// Crear una fecha por año, mes y día del mes
		LocalDate date2 = LocalDate.of(1994, 5, 26);
		System.out.println(
				"Fecha creada por año, mes, día del mes, instanciando la fecha como LocalDate date2 = LocalDate.of(1994, 5, 26);: "
						+ date2);

		// Crear una fecha por año y día del año
		LocalDate date3 = LocalDate.ofYearDay(2000, 312);
		System.out.println(
				"Fecha creada por año y día del año, instanciando la fecha como LocalDate date3 = LocalDate.ofYearDay(2000, 312);: "
						+ date3);

		// Crear una fecha como diferencia de días pasados desde EPOCHday (1970-01-01)
		LocalDate date4 = LocalDate.ofEpochDay(21437);
		LocalDate epoch = LocalDate.EPOCH;
		System.out.println("Fecha creada como diferencia de 21437 días pasados desde " + epoch
				+ ", instanciando la fecha como LocalDate date4 = LocalDate.ofEpochDay(21437);: " + date4);

		// Crear una fecha a partir de una fecha introducida
		LocalDate date5 = LocalDate.parse("2017-12-03");
		System.out.println(
				"Fecha creada a partir de la fecha introducida, instanciando la fecha como LocalDate date5 = LocalDate.parse(\"2017-12-03\");: "
						+ date5);

		System.out.println("\n\n\t---COMPROBAR DÍAS PASADOS DESDE Y HASTA UNA ÉPOCA---\n");

		// Días pasados desde las fechas hasta la época 1970-01-01
		System.out.println(
				"Días pasados desde " + date1 + " hasta 1970-01-01 usando date1.toEpochDay(): " + date1.toEpochDay());
		System.out.println(
				"Días pasados desde " + date2 + " hasta 1970-01-01 usando date2.toEpochDay(): " + date2.toEpochDay());
		System.out.println(
				"Días pasados desde " + date3 + " hasta 1970-01-01 usando date3.toEpochDay(): " + date3.toEpochDay());
		System.out.println(
				"Días pasados desde " + date4 + " hasta 1970-01-01 usando date4.toEpochDay(): " + date4.toEpochDay());
		System.out.println(
				"Días pasados desde " + date5 + " hasta 1970-01-01 usando date5.toEpochDay(): " + date5.toEpochDay());

		System.out.println("\n\n\t\t---OBTENER INFORMACIÓN DE UNA FECHA---\n");

		// Obtener el día numérico del mes
		System.out.println("Días del mes de " + date1 + " usando date1.getDayOfMonth(): " + date1.getDayOfMonth());

		// Obtener el día numérico del año
		System.out.println("Días del año de " + date2 + " usando date2.getDayOfYear(): " + date2.getDayOfYear());

		// Obtener el mes numérico del año
		System.out.println("Mes del año de " + date3 + " usando date3.getMonthValue(): " + date3.getMonthValue());

		// Obtener el año
		System.out.println("Año de " + date4 + " usando date4.getYear(): " + date4.getYear());

		// Obtener el día de la semana como cadena de caracteres
		System.out.println("Día de la semana de " + date5 + " usando date5.getDayOfWeek(): " + date5.getDayOfWeek());

		// Obtener el día de la semana como cadena de caracteres
		System.out.println("Mes del año de " + date2 + " usando date2.getMonth(): " + date2.getMonth());

		// Comprobar si el año de la fecha dada es bisiesto
		if (date4.isLeapYear()) {
			System.out.println("El año de la fecha " + date4 + " es bisiesto, usando date4.isLeapYear()");
		} else {
			System.out.println("El año de la fecha " + date4 + " no es bisiesto, usando date4.isLeapYear()");
		}
		if (date2.isLeapYear()) {
			System.out.println("El año de la fecha " + date2 + " es bisiesto, usando date2.isLeapYear()");
		} else {
			System.out.println("El año de la fecha " + date2 + " no es bisiesto, usando date2.isLeapYear()");
		}

		// Comprobar hasta qué día llega el mes de la fecha dada
		System.out.println("El mes de la fecha " + date1 + " llega hasta el día " + date1.lengthOfMonth()
				+ " usando date1.lengthOfMonth().");

		// Comprobar hasta qué día llega el año de la fecha dada
		System.out.println("El mes de la fecha " + date3 + " llega hasta el día " + date3.lengthOfYear()
				+ " usando date1.lengthOfYear().");

		System.out.println("\n\n\t\t---OPERACIONES CON FECHA---\n");

		// Añadir y sustraer días a una fecha
		System.out.println(
				"Sustraemos 120 días a la fecha " + date4 + " con date4.minusDays(120): " + date4.minusDays(120));
		System.out
				.println("Añadimos 538 días a la fecha " + date3 + " con date3.plusDays(538): " + date3.plusDays(538));

		// Añadir y sustraer meses a una fecha
		System.out.println(
				"Sustraemos 41 meses a la fecha " + date1 + " con date1.minusMonths(41): " + date1.minusMonths(41));
		System.out.println(
				"Añadimos 23 meses a la fecha " + date4 + " con date4.plusMonths(23): " + date4.plusMonths(23));

		// Añadir y sustraer semanas a una fecha
		System.out.println(
				"Sustraemos 210 semanas a la fecha " + date5 + " con date5.minusWeeks(210): " + date5.minusWeeks(210));
		System.out.println(
				"Añadimos 135 semanas a la fecha " + date2 + " con date2.plusWeeks(135): " + date2.plusWeeks(135));

		// Añadir y sustraer años a una fecha
		System.out.println(
				"Sustraemos 19 años a la fecha " + date3 + " con date3.minusYears(19): " + date3.minusYears(19));
		System.out.println("Añadimos 5 años a la fecha " + date1 + " con date1.plusYears(5): " + date1.plusYears(5));

		System.out.println("\n\n\t\t---COMPARACIÓN DE FECHAS---\n");

		if (date1.isAfter(date5)) {
			System.out.println(date1 + " es posterior a " + date5 + ", usando date1.isAfter(date5)");
		} else {
			System.out.println(date1 + " es anterior a " + date5 + ", usando date1.isAfter(date5");
		}

		if (date3.isBefore(date4)) {
			System.out.println(date3 + " es anterior a " + date4 + ", usando date3.isBefore(date4)");
		} else {
			System.out.println(date3 + " es posterior a " + date4 + ", usando date3.isBefore(date4)");
		}

		if (date2.isEqual(date2)) {
			System.out.println(date2 + " es igual a " + date2 + ", usando date2.isEqual(date2)");
		} else {
			System.out.println(date2 + " no es igual a " + date2 + ", usando date2.isEqual(date2)");
		}

		if (date1.compareTo(date5) > 0) {
			System.out.println(date1 + " es mayor que " + date5 + ", usando date1.compareTo(date5)");
		} else if (date1.compareTo(date5) < 0) {
			System.out.println(date1 + " es menor que " + date5 + ", usando date1.compareTo(date5)");
		} else if (date1.compareTo(date5) == 0) {
			System.out.println(date1 + " es igual que " + date5 + ", usando date1.compareTo(date5)");
		}

		if (date2.compareTo(date3) > 0) {
			System.out.println(date2 + " es mayor que " + date3 + ", usando date2.compareTo(date3)");
		} else if (date2.compareTo(date3) < 0) {
			System.out.println(date2 + " es menor que " + date3 + ", usando date2.compareTo(date3)");
		} else if (date2.compareTo(date3) == 0) {
			System.out.println(date2 + " es igual que " + date3 + ", usando date2.compareTo(date3)");
		}

		if (date4.compareTo(date4) > 0) {
			System.out.println(date4 + " es mayor que " + date4 + ", usando date4.compareTo(date4)");
		} else if (date4.compareTo(date4) < 0) {
			System.out.println(date4 + " es menor que " + date4 + ", usando date4.compareTo(date4)");
		} else if (date4.compareTo(date4) == 0) {
			System.out.println(date4 + " es igual que " + date4 + ", usando date4.compareTo(date4)");
		}

		System.out.println("\n\n\t---CONVERTIR FECHAS EN FECHA Y HORA---\n");

		// Combinar fecha dada con la hora de comienzo de ese día
		LocalDateTime dateTime1 = date1.atStartOfDay();
		System.out.println("Combinar fecha " + date1
				+ " con la hora de comienzo del día, instanciando un LocalDateTime dateTime1 = date1.atStartOfDay();: "
				+ dateTime1);

		// Combinar fecha dada con la hora y minutos
		LocalDateTime dateTime2 = date2.atTime(12, 19);
		System.out.println("Combinar fecha " + date2
				+ " con 12 horas, 19 minutos, instanciando un LocalDateTime dateTime2 = date2.atTime(12, 19);: "
				+ dateTime2);

		// Combinar fecha dada con la hora, minutos y segundos
		LocalDateTime dateTime3 = date3.atTime(1, 21, 54);
		System.out.println("Combinar fecha " + date3
				+ " con 1 hora, 21 minutos y 54 segundos, instanciando un LocalDateTime dateTime3 = date3.atTime(1, 21,54);: "
				+ dateTime3);

		// Combinar fecha dada con la hora, minutos, segundos y milisegundos
		LocalDateTime dateTime4 = date4.atTime(1, 21, 54, 212458583);
		System.out.println("Combinar fecha " + date4
				+ " con 1 hora, 21 minutos, 54 segundos y 212458583 milisegundos, instanciando un LocalDateTime dateTime4 = date4.atTime(1, 21, 54, 212458583);: "
				+ dateTime4);
	}
}