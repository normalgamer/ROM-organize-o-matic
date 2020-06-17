
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	
	public static File folder;
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("ROM Organize-o-matic v1.0");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 130);
		
		JButton selectFolder = new JButton("Select Folder...");
		//JButton separateByID = new JButton("Separate by ID");
		JButton separateByAlphabeticalOrder = new JButton("Separate alphabetically");
		
		JLabel status = new JLabel("Status: Waiting for folder");
		
		frame.add(selectFolder);
		//frame.add(separateByID);
		frame.add(separateByAlphabeticalOrder);
		frame.add(status);
		
		frame.setLocationRelativeTo(null);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER));
		frame.setVisible(true);
		
		
		selectFolder.addActionListener(new ActionListener(){  
	        public void actionPerformed(ActionEvent e){
	        	JFileChooser chooser = new JFileChooser();
	    	    chooser.setCurrentDirectory(new java.io.File("."));
	    	    chooser.setDialogTitle("Choose folder with ISOs");
	    	    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	    	    chooser.setAcceptAllFileFilterUsed(false);

	    	    if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
	    	      System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
	    	      folder = chooser.getSelectedFile();
	    	      System.out.println(folder.toString());
	    	      System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
	    	    } else {
	    	      System.out.println("No Selection ");
	    	    }
	    	    
	    	    status.setText("Waiting for action...");
	    	    
	        }  
	    });
		
		
		
		
		separateByAlphabeticalOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File[] listOfFiles = folder.listFiles();
				
				File f;
				
				status.setText("Sorting ROMs...");
				
				String[] alphabet = new String [27];
				alphabet[0] = folder+"\\#";
				alphabet[1] = folder+"\\A";
				alphabet[2] = folder+"\\B";
				alphabet[3] = folder+"\\C";
				alphabet[4] = folder+"\\D";
				alphabet[5] = folder+"\\E";
				alphabet[6] = folder+"\\F";
				alphabet[7] = folder+"\\G";
				alphabet[8] = folder+"\\H";
				alphabet[9] = folder+"\\I";
				alphabet[10] = folder+"\\J";
				alphabet[11] = folder+"\\K";
				alphabet[12] = folder+"\\L";
				alphabet[13] = folder+"\\M";
				alphabet[14] = folder+"\\N";
				alphabet[15] = folder+"\\O";
				alphabet[16] = folder+"\\P";
				alphabet[17] = folder+"\\Q";
				alphabet[18] = folder+"\\R";
				alphabet[19] = folder+"\\S";
				alphabet[20] = folder+"\\T";
				alphabet[21] = folder+"\\U";
				alphabet[22] = folder+"\\V";
				alphabet[23] = folder+"\\W";
				alphabet[24] = folder+"\\X";
				alphabet[25] = folder+"\\Y";
				alphabet[26] = folder+"\\Z";
				
				for(int x = 0; x <= 26; x++) {
					String s = alphabet[x];
					new File(s).mkdir();
					System.out.println(s);
				}
				
				
				
				
				for (int i = 0; i < listOfFiles.length; i++) {
					if (listOfFiles[i].isFile()) {
						System.out.println("File " + listOfFiles[i].getName());
						if(listOfFiles[i].getName().charAt(0) == 'A' || listOfFiles[i].getName().charAt(0) == 'a') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\A\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						
						if(listOfFiles[i].getName().charAt(0) == 'B' || listOfFiles[i].getName().charAt(0) == 'b') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\B\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						
						if(listOfFiles[i].getName().charAt(0) == 'C' || listOfFiles[i].getName().charAt(0) == 'c') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\C\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						
						if(listOfFiles[i].getName().charAt(0) == 'D' || listOfFiles[i].getName().charAt(0) == 'd') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\D\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'E' || listOfFiles[i].getName().charAt(0) == 'e') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\E\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'F' || listOfFiles[i].getName().charAt(0) == 'f') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\F\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'G' || listOfFiles[i].getName().charAt(0) == 'g') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\G\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'H' || listOfFiles[i].getName().charAt(0) == 'h') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\H\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'I' || listOfFiles[i].getName().charAt(0) == 'i') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\I\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'J' || listOfFiles[i].getName().charAt(0) == 'j') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\J\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'K' || listOfFiles[i].getName().charAt(0) == 'k') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\K\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'L' || listOfFiles[i].getName().charAt(0) == 'l') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\L\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'M' || listOfFiles[i].getName().charAt(0) == 'm') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\M\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'N' || listOfFiles[i].getName().charAt(0) == 'n') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\N\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'O' || listOfFiles[i].getName().charAt(0) == 'o') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\O\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'P' || listOfFiles[i].getName().charAt(0) == 'p') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\P\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'Q' || listOfFiles[i].getName().charAt(0) == 'q') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\Q\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'R' || listOfFiles[i].getName().charAt(0) == 'r') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\R\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'S' || listOfFiles[i].getName().charAt(0) == 's') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\S\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'T' || listOfFiles[i].getName().charAt(0) == 't') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\T\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'U' || listOfFiles[i].getName().charAt(0) == 'u') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\U\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'V' || listOfFiles[i].getName().charAt(0) == 'v') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\V\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'W' || listOfFiles[i].getName().charAt(0) == 'w') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\W\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'X' || listOfFiles[i].getName().charAt(0) == 'x') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\X\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'Y' || listOfFiles[i].getName().charAt(0) == 'y') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\Y\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						if(listOfFiles[i].getName().charAt(0) == 'Z' || listOfFiles[i].getName().charAt(0) == 'z') {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\Z\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						else {
							String s = new String();
							s = folder + "\\" + listOfFiles[i].getName();
							System.out.println(s);
							try {
								Files.move 
								        (Paths.get(s),  
								        Paths.get(folder+"\\#\\"+listOfFiles[i].getName()));
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							} 
						}
						
						status.setText("ROMs sorted");
						
					} 
					
					else if (listOfFiles[i].isDirectory()) {
					  System.out.println("Directory " + listOfFiles[i].getName());
					  
					}
					
				  
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		separateByID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				File[] listOfFiles = folder.listFiles();

				for (int i = 0; i < listOfFiles.length; i++) {
					if (listOfFiles[i].isFile()) {
						
						System.out.println("File " + listOfFiles[i].getName());
					} else if (listOfFiles[i].isDirectory()) {
						System.out.println("Directory " + listOfFiles[i].getName());
					}
				}
				
				
				
				// Get iso's ID, first 6 bytes
				
				InputStream is = null;
			      byte[] buffer = new byte[6];
			      char c;
			      
			      try {
			         // new input stream created
			         is = new FileInputStream("C://Jon Izaguirre//ROMs/Wii/Mario Kart Wii (USA).iso");
			         
			         System.out.println("Characters printed:");
			         
			         // read stream data into buffer
			         is.read(buffer);
			         
			         // for each byte in the buffer
			         for(byte b:buffer) {
			         
			            // convert byte to character
			            c = (char)b;
			            
			            // prints character
			            System.out.print(c);
			         }
			         
			      } catch(Exception x) {
			         // if any I/O error occurs
			         x.printStackTrace();
			      } finally {
			         // releases system resources associated with this stream
			         if(is!=null)
						try {
							is.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
			      }
				
				
			}
		});*/
		
		
		
		
	}

}
