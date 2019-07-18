# Frame 
###chatClient1 pack()  method
*Causes this Window to be sized to fit the preferred size and layouts of its subcomponents.*

###chatClient2 
*This version, may close the window*

```java
    this.addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
    });
```

### chatClient3
*add a inner class*
```java
 private class TextFieldListener implements ActionListener{


        /**
         * Invoked when an action occurs.
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tf.getText().trim();
            ta.setText(s);
            tf.setText("");
        }
    }
```
*tf.setText(""); can reset the string to be null*

### chatClient4
*DataInputStream && DataOutputStream*
```java
   try{   //chatServer
            ServerSocket ss = new ServerSocket(8888);
            while(true){
                Socket socket = ss.accept();
                System.out.println("A client connected!");
                DataInputStream input = new DataInputStream(socket.getInputStream());
                String s = input.readUTF();
                System.out.println(s);
                input.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

//chatClient
private class TextFieldListener implements ActionListener{
        /**
         * Invoked when an action occurs.
         * @param e
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = tf.getText().trim();
            ta.setText(s);
            tf.setText("");
            try {
                System.out.println(s);
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                out.writeUTF(s);
                out.flush();
                //out.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
```




