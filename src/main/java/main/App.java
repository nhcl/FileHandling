package main;

import nhclCo.PaperCompany;

import java.io.*;

public class App {
	
	public static void main(String[] args) throws IOException {
	
		 PaperCompany nhclCo = new PaperCompany();
		 nhclCo.receiveShipments();
		 //nhclCo.receiveOrders();
		 nhclCo.readFromFile();
		 nhclCo.processOrders();
		 nhclCo.printSummary();
	}
}
