package HomeWork14;

    class MessagePrint implements Printer {

            public static class Message {
                private String text;
                private String sender;

                public Message(String text, String sender) {
                    this.text = text;
                    this.sender = sender;
                }

                public String getText() {
                    return text;
                }

                public String getSender() {
                    return sender;
                }

                public void setText(String text) {
                    this.text = text;
                }

                public void setSender(String sender) {
                    this.sender = sender;
                }
            }
            public void print (Message message){

                if (message.getSender() == null && message.getSender().isEmpty()) {
                    System.out.println("An anonymous user sent a message: " + message.getText());
            } else {
                    System.out.println("Sender " + message.getSender() + " Sent a message: " +
                            message.getText());
                }
            }
        }
