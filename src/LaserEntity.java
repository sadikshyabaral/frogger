/* AlienEntity.java
 * March 27, 2006
 * Represents one of the aliens
 */
public class LaserEntity extends Entity {

  //private double moveSpeed; // horizontal speed

  private Game game; // the game in which the alien exists

  /* construct a new alien
   * input: game - the game in which the alien is being created
   *        r - the image representing the alien
   *        x, y - initial location of alien
   */
  
  // move the laser off the screen or back on
  public void changelazer() {
	  this.setX(this.getX() * -1);
  }
  
  public LaserEntity(Game g, String r, int newX, int newY) {
    super(r, newX, newY);  // calls the constructor in Entity
    game = g;
  } // constructor


  /* collidedWith
   * input: other - the entity with which the alien has collided
   * purpose: notification that the alien has collided
   *          with something
   */
   public void collidedWith(Entity other) {
     // collisions with aliens are handled in ShotEntity and ShipEntity
   } // collidedWith
  
} // AlienEntity class
