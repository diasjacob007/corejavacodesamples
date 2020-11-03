/**
 * 
 */
package com.ira.java8.datetime;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Era;
import java.time.chrono.IsoChronology;
import java.time.chrono.IsoEra;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.List;

/**
 * @author EVAAN
 *
 */
public class LocalDateTimeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		getLocalDateDemo1();
//		getLocalDateDemo2();
//		getLocalTimeDemo1();
//		convertTimeFormat();
//		convertDateFormat();
//		getLocalDateTimeDemo1();
		
		
	}

	private static void getLocalDateTimeDemo1() {
		// Using the now()
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("Current local date time is: " + localDateTime);

		// Using the of()
		LocalDateTime localDateTime2 = LocalDateTime.of(2020, Month.NOVEMBER, LocalDate.now().getDayOfMonth(),
				LocalTime.now().getHour(), LocalTime.now().getMinute());
		System.out.println("Local date time using the of method is: " + localDateTime2);

		// Using the parse()
		LocalDateTime localDateTime3 = LocalDateTime.parse("2020-10-26T11:55:24.667723400");
		System.out.println("Local date time using the parse method is: " + localDateTime3);
		System.out.println("Seperating the Date and Time from : " + localDateTime3);
		LocalDate localDate = localDateTime3.toLocalDate();
		LocalTime localTime = localDateTime3.toLocalTime();
		System.out.println("Seperated Local Date is: " + localDate);
		System.out.println("Seperated Local Time is: " + localTime);

		long epochSecond = localDateTime3.toEpochSecond(ZoneOffset.MAX);
		System.out.println("Epoch Second is: " + epochSecond);

		// Adding days to LocalDateTime
		LocalDateTime datetmeafter10days = LocalDateTime.now().plusDays(10);
		System.out.println("After 10 days the then datetime will be: " + datetmeafter10days);

		// Adding years to current date-time
		LocalDateTime datetimeafter2years = LocalDateTime.now().plusYears(2);
		System.out.println("After 2 years the date time will be: " + datetimeafter2years);

		Month month = LocalDateTime.now().getMonth();
		System.out.println("Current month returned from: " + LocalDateTime.now() + " is: " + month);

		int year = LocalDateTime.now().getYear();
		System.out.println("Current year returned from: " + LocalDateTime.now() + " is: " + year);
	}

	private static void getLocalTimeDemo1() {
		LocalTime localTime1 = LocalTime.now();
		System.out.println("Current time is:" + localTime1);
		System.out.println("-----Fetching current Hour, Minute and Second------");
		int hour = LocalTime.now().getHour();
		int minute = LocalTime.now().getMinute();
		int second = LocalTime.now().getSecond();
		System.out.println("Current Time is:" + hour + ":" + minute + ":" + second);

		System.out.println("Using the parse method");
		LocalTime parsedTime = LocalTime.parse("04:21");
		System.out.println("Parsed Time is: " + parsedTime);

		System.out.println("Using the of method");
		LocalTime ofTime = LocalTime.of(04, 22);
		System.out.println("Using of() time is: " + ofTime);

		System.out.println("Adding hours to time");
		LocalTime addedTime = LocalTime.parse("04:30").plus(1, ChronoUnit.HOURS);
		System.out.println("Added time value is: " + addedTime);

		LocalTime substractedTime = LocalTime.parse("05:30").minus(2, ChronoUnit.HOURS);
		System.out.println("Substracted Time is: " + substractedTime);

		String Hr12formattime = DateTimeFormatter.ofPattern("hh:mm a").format(LocalTime.now());
		System.out.println("The 12 hour time is: " + Hr12formattime);
	}

	private static void convertTimeFormat() {
		String input24HrFormat = "16:01:02";
		final DateTimeFormatter inTimeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
		final DateTimeFormatter outTimeFormat = DateTimeFormatter.ofPattern("K:mm:ss a");
		String Hr12TimeFormat = LocalTime.parse(input24HrFormat, inTimeFormat).format(outTimeFormat);
		System.out.println(Hr12TimeFormat);
	}

	private static void convertDateFormat() {
		String startDateString = "2017-03-10";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String convertedFormat = LocalDate.parse(startDateString, formatter).format(formatter2);
		System.out.println("The converted date is: " + convertedFormat);
	}

	private static void getLocalDateDemo2() {
		int dayOfMonth = LocalDate.now().getDayOfMonth();
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		int dayOfYear = LocalDate.now().getDayOfYear();

		System.out.println("Day of the Month is: " + dayOfMonth + "\n and Day of the Week is: " + dayOfWeek
				+ "\n and Day of the Year is: " + dayOfYear);
		System.out.println("--------------------------------------------------------------------");
		IsoEra era = LocalDate.now().getEra();
		Month month = LocalDate.now().getMonth();
		int monthValue = LocalDate.now().getMonthValue();
		int year = LocalDate.now().getYear();
		IsoChronology chronology = LocalDate.now().getChronology();

		List<Era> eras = chronology.eras();
		System.out.println("Available eras are:");
		eras.stream().forEach(data -> System.out.println(data.getValue()));

		System.out.println("Current Era is: " + era + "\n Current Month is: " + month + "\n Current Month Value is: "
				+ monthValue + "\n Chronology value is: " + chronology);

		System.out.println("-----------------------------------------------------------");
		boolean checkLeapYear = LocalDate.now().isLeapYear();
		if (checkLeapYear) {
			System.out.println(LocalDate.now().getYear() + " is a Leap Year");
		} else {
			System.out.println(LocalDate.now().getYear() + " is not a Leap Year");
		}
		System.out.println("Checking 2019 is Leap year or not");
		boolean check2019LeapYear = LocalDate.now().minusYears(1).isLeapYear();
		if (check2019LeapYear) {
			System.out.println(LocalDate.now().minusYears(1).getYear() + " is a Leap Year");
		} else {
			System.out.println(LocalDate.now().minusYears(1).getYear() + " is not a Leap Year");
		}

		System.out.println("Comparing two Dates");
		LocalDate firstDate = LocalDate.now();
		LocalDate secondDate = LocalDate.now().minusYears(1);

		System.out.println("First Date is: " + firstDate + " and second Date is :" + secondDate);
		System.out.println("Checking firstDate is before of secondDate");
		boolean isbefore = firstDate.isBefore(secondDate);
		if (isbefore) {
			System.out.println(firstDate + " is before of: " + secondDate);
		} else {
			System.out.println(firstDate + " is after of: " + secondDate);
		}

		System.out.println("-------------Finding First and Last Day of the Month & Year----------------");
		LocalDate firstDayOftheMonth = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
		LocalDate lastDayOftheMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		LocalDate firstDayOftheYear = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
		LocalDate lastDayOftheYear = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());

		System.out.println("First date of month: " + LocalDate.now().getMonth() + " was: " + firstDayOftheMonth
				+ " and that day was a: " + firstDayOftheMonth.getDayOfWeek());
		System.out.println("Last date of month :" + LocalDate.now().getMonth() + " is: " + lastDayOftheMonth
				+ " and that day is: " + lastDayOftheMonth.getDayOfWeek());
		System.out.println("First day of the year:" + LocalDate.now().getYear() + " was:" + firstDayOftheYear
				+ " and that day was a: " + firstDayOftheYear.getDayOfWeek());
		System.out.println("Last day of the year:" + LocalDate.now().getYear() + " will be:" + lastDayOftheYear
				+ " and that day will be a: " + lastDayOftheYear.getDayOfWeek());
	}

	private static void getLocalDateDemo1() {
		// 1.Use LocalDate
		LocalDate localDate = LocalDate.now();
		System.out.println("Current Date is: " + localDate);

		// 2.Using the overloaded method
		LocalDate localDate2 = LocalDate.now(Clock.systemDefaultZone());
		System.out.println("LocalDate with overload format: " + localDate2);

		// 3.Using the ZonoId
		LocalDate localDate3 = LocalDate.now(ZoneId.of("Australia/Sydney"));
		System.out.println("LocalDate with Zone: " + localDate3);

		System.out.println("---------------------------------------");
		LocalDate localDate4 = LocalDate.of(2019, 03, 10);
		System.out.println("The entered date value is: " + localDate4);

		LocalDate localDate5 = LocalDate.parse("2020-10-21");
		System.out.println("Formatted Date is: " + localDate5);

		System.out.println("Adding 2 days into : " + localDate5 + " i.e " + localDate5.plusDays(2));

		System.out.println("Substracting 2 days from : " + localDate5 + " i.e " + localDate5.minusDays(2));
	}

}
