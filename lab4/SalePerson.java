public class SalePerson implements Comparable
{
	private String firstName;
	private String lastName;
	private int totalSales;

	public SalePerson(String firstName, String lastName, int totalSales)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.totalSales = totalSales;
	}

	public String toString()
	{
		return lastName + " , " + firstName + " : " + totalSales;
	}

	public boolean equals(Object other)
	{
		if (this == other)
			return true;
		if (!(other instanceof SalePerson))
			return false;

		SalePerson person = (SalePerson) other;
		return firstName.equals(person.firstName)
			&& lastName.equals(person.lastName);
	}

	public int hashCode()
	{
		return 31 * firstName.hashCode() + lastName.hashCode();
	}

	public int compareTo(Object other)
	{
		SalePerson person = (SalePerson) other;
		if (totalSales < person.totalSales)
			return -1;
		if (totalSales > person.totalSales)
			return 1;
		return lastName.compareTo(person.lastName);
	}
}
