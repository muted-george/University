  class Point {
    private double x_coord;//private = restricted access
    private double y_coord;//private = restricted access

    //loaded constructor
     public Point(double x, double y) {
         x_coord = x;
         y_coord = y;
     }

     //Getter
     public double getX_coord() {
         return x_coord;
     }
     public double getY_coord() {
         return y_coord;
     }

     //getter/accessor methods for each instance variable
     public void setX_coord(double newX_coord) {
         this.x_coord = newX_coord;
     }
     public void setY_coord(double new_Ycoord) {
         this.y_coord = new_Ycoord;
     }

     //calculate the gradient
     public double gradient(Point p){

         // Check for division by zero (vertical line).... Assisted by Chatgpt
         if (this.x_coord == p.getX_coord()) {
             System.out.println("Gradient is undefined (vertical line).");
             return Double.NaN; // Return NaN to indicate undefined gradient
         }

         // Calculate the gradient: (y2 - y1) / (x2 - x1)
         double gradient = (p.getY_coord() - this.y_coord) / (p.getX_coord() - this.x_coord);

         // round off 2 decimal places
         gradient = Math.round(gradient * 100.0) / 100.0;

         return gradient;

     }

     //calculate the distance
     public double distance(Point p){
         //Differences in x and y coordinates
         double xDiff = p.getX_coord() - this.x_coord;
         double yDiff = p.getY_coord() - this.y_coord;

         // Squared
         double xDiffSquared = xDiff * xDiff;
         double yDiffSquared = yDiff * yDiff;

         // Add X and Y
         double sumOfSquares = xDiffSquared + yDiffSquared;

         //square root
         double distance = Math.sqrt(sumOfSquares);

         // Round the distance to 2 decimal places
         distance = Math.round(distance * 100.0) / 100.0;

         return distance;
     }

     // check if equal points
     public boolean isEqual(Point p) {
         boolean equalX = this.x_coord == p.getX_coord();
         boolean equalY =  this.y_coord == p.getY_coord();
         return equalX && equalY;
     }

     //calculate the midpoint
     public Point midpoint(Point p) {
         double midX = (this.x_coord + p.getX_coord()) / 2;
         double midY = (this.y_coord + p.getY_coord()) / 2;
         return new Point(midX, midY);
     }




 }
