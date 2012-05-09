package bl;

import java.awt.EventQueue;
import gui.*;

public class GuiController {

public static void EventListstarter(){
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				EventList el = new EventList();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
	
}
public static void Registerstarter(){
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Register r = new Register();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
public static void CreateEventstarter(){
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				CreateEvent ce = new CreateEvent();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
public static void Locationstarter(){
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Location l = new Location();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
public static void Loginstarter(){
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Login window = new Login();
			
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}
}
