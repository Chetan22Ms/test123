package com.test.automation

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class automationKeywords {
	
	@Keyword
	def printMessage(){
		
		println(" Hello Guays")
		
		
	}
	
	@Keyword
	def printName1(String name){
		println (" hell"+name+" R u ther ")
	}
	
	@Keyword
	def printMessage1(String name1){
		println ("Hi  "+name1+",  I want job in BOSCH ")
	}
	
	@Keyword
	def calculateSum(){
		
		int a = 10;
		def b = 20;
		
		def c = a+b;
		println ("\n sum is   "+c+"   \n")
	}
	
	@Keyword
	def calculateSum1(int a, int b){
		
		//int a = 10;
		//def b = 20;
		
		def c = a+b;
		println ("\n sum is   "+c+"   \n")
}
}
	




	


