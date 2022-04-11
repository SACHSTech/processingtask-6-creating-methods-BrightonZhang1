import processing.core.PApplet;

/**
 * Sketching a house using parameters with methods
 * @author: B.Zhang
 */

public class Sketch extends PApplet {
  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }
 
  public void draw() {

    // draw sky
    drawSky(0, 400, 300);

    // draw house
    drawHouse(200, 175, 240, 65, 65, 91, 98, 110);

    // draw chimney
    drawChimney(325, 25, 91, 98, 110);

    // draw sun
    drawSun(25, 100, 235, 222, 52);

  }

  /**
   * sketches the sky
   * 
   * @param intStartCoord: Starting coordinate for the sky
   * @param intSkyX: X dimension for the sky
   * @param intSkyY: Y dimension for the sky
   * 
   */
  public void drawSky(int intStartCoord, int intSkyX, int intSkyY){

    // draw sky
    noStroke();
    fill(52, 223, 235);
    rect(intStartCoord, intStartCoord, intSkyX, intSkyY);

  }
  
  /**
   * sketches the chimney
   * 
   * @param fltChimneyX: X coordinate of the chimney
   * @param fltChimneyWidth: X Dimension of the chimney
   * @param fltChimneyR: Red rgb value for the chimney
   * @param fltChimneyG: Green rgb value for the chimney
   * @param fltChimneyB: Blue rgb value for the chimney
   * 
   */
  public void drawChimney(float fltChimneyX, float fltChimneyWidth, float fltChimneyR, float fltChimneyG, float fltChimneyB){

    // reassigns new x value for the chimney
    fltChimneyX = newChimneyX(fltChimneyX, fltChimneyWidth);
  
    // draw house chimney
    noStroke();
    fill(fltChimneyR, fltChimneyG, fltChimneyB);
    rect(fltChimneyX, 110, 25, 60);

  }

  /**
   * sketches the chimney to the right of the original coordinate
   * 
   * @param fltChimneyX: X coordinate of the chimney
   * @param fltChimneyWidth: X Dimension of the chimney
   * 
   */
  public float newChimneyX(float fltChimneyX, float fltChimneyWidth){

    // shifts chimney to the right
    return fltChimneyX + fltChimneyWidth/8;

  }

  /**
   * sketches the chimney to the right of the original coordinate
   * 
   * @param intHouseX: X coordinate of the body of the house
   * @param intHouseY: Y coordinate of the body of the house
   * @param intBodyR: Red rgb value for the body of the house
   * @param intBodyG: Green rgb value for the body of the house
   * @param intBodyB: Blue rgb value for the body of the house
   * @param intRoofR: Red rgb value for the roof
   * @param intRoofG: Green rgb value for the roof
   * @param intRoofB: Blue rgb value for the roof
   * 
   */
  public void drawHouse(int intHouseX, int intHouseY, int intBodyR, int intBodyG, int intBodyB, int intRoofR, int intRoofG, int intRoofB){

    // draw house body
    fill(intBodyR, intBodyG, intBodyB);
		rect(intHouseX, intHouseY, 150, 125);
    
    // draw house roof
    fill(intRoofR, intRoofG, intRoofB);
    triangle(intHouseX - 25, intHouseY, intHouseX + 175, intHouseY, intHouseX + 75, intHouseY - 75);

  }

  /**
   * sketches the chimney to the right of the original coordinate
   * 
   * @param intSunCoord: X coordinate of the Sun
   * @param intSunDiameter: Diameter of the sun
   * @param intSunR: Red rgb value for the Sun
   * @param intSunG: Green rgb value for the Sun
   * @param intSunB: Blue rgb value for the Sun
   * 
   */
  public void drawSun(int intSunCoord, int intSunDiameter, int intSunR, int intSunG, int intSunB){

    // draw sun
    fill(intSunR, intSunG, intSunB);
    ellipse(intSunCoord, intSunCoord, intSunDiameter, intSunDiameter);

  }
}