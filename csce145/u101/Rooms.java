public class Rooms {
   private Boolean room1;
   private Boolean room2;
   private Boolean room3;
   private Boolean room4;
   private Boolean room5;

   public Rooms() {
      this.room1 = false;
      this.room2 = false;
      this.room3 = false;
      this.room4 = false;
      this.room5 = false;
   }

   public void isInRoom() {
      if (room1) {
         printRoom(this.room1Map);
      } else if (room2) {
         printRoom(this.room2Map);
      } else if (room3) {
         printRoom(this.room3Map);
      } else if (room4) {
         printRoom(this.room4Map);
      } else if (room5) {
         printRoom(this.room5Map);
      }

   }

   public void printRoom(char[][] room) {
      System.out.print("\033[H\033[2J");
      System.out.println("you cant move. press e and enter it to exit");
      for (int y = 0; y < room.length; y++) {
         for (int x = 0; x < room[y].length; x++) {
            if (y == 4 && x == 5) {
               System.out.print('@');
               System.out.print(' ');
            } else {
               System.out.print(room[y][x]);
               System.out.print(room[y][x]);
            }
         }
         System.out.print("\n");
      }
   }

   public void setRoom1(Boolean room1) {
      this.room1 = room1;
   }

   public void setRoom2(Boolean room2) {
      this.room2 = room2;
   }

   public void setRoom3(Boolean room3) {
      this.room3 = room3;
   }

   public void setRoom4(Boolean room4) {
      this.room4 = room4;
   }

   public void setRoom5(Boolean room5) {
      this.room5 = room5;
   }

   public Boolean getRoom1() {
      return room1;
   }

   public Boolean getRoom2() {
      return room2;
   }

   public Boolean getRoom3() {
      return room3;
   }

   public Boolean getRoom4() {
      return room4;
   }

   public Boolean getRoom5() {
      return room5;
   }

   private char[][] room1Map = {
         { '_', '_', '_', '_', '_', '_', '_', '_', '_', ' ' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', '‡', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '_', '_', '_', '_', '_', '_', '_', '_', '_', ' ' }
   };
   private char[][] room2Map = {
         { ' ', '_', '_', '_', '_', '_', '_', '_', '_', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', '‡', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { ' ', '_', '_', '_', '_', '_', '_', '_', '_', ' ' }
   };
   private char[][] room3Map = {
         { '_', '_', '_', '_', '_', '_', '_', '_', '_', ' ' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', '‡', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '_', '_', '_', '_', '_', '_', '_', '_', '_', ' ' }
   };
   private char[][] room4Map = {
         { ' ', '_', '_', '_', '_', '_', '_', '_', '_', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', '‡', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' },
         { ' ', '_', '_', '_', '_', '_', '_', '_', '_', ' ' }
   };
   private char[][] room5Map = {
         { ' ', '_', '_', '_', '_', '_', '_', '_', '_', ' ' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '|', ' ', ' ', ' ', ' ', '‡', ' ', ' ', ' ', '|' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|' },
         { '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' }
   };

}
