package com;

public class ContractEmployee extends Employee {
 private int contractDuration;
 private int payPerDay;
 public  ContractEmployee() {
}
public int getContractDuration() {
	return contractDuration;
}
public void setContractDuration(int contractDuration) {
	this.contractDuration = contractDuration;
}
public int getPayPerDay() {
	return payPerDay;
}
public void setPayPerDay(int payPerDay) {
	this.payPerDay = payPerDay;
}
public ContractEmployee(int contractDuration, int payPerDay) {
	super();
	this.contractDuration = contractDuration;
	this.payPerDay = payPerDay;
}
@Override
public String toString() {
	return "ContractEmployee [contractDuration=" + contractDuration + ", payPerDay=" + payPerDay + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + contractDuration;
	result = prime * result + payPerDay;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ContractEmployee other = (ContractEmployee) obj;
	if (contractDuration != other.contractDuration)
		return false;
	if (payPerDay != other.payPerDay)
		return false;
	return true;
}
}