/* AlienEntity.java
 * March 27, 2006
 * Represents one of the aliens
 */
public class FlashPolice extends Entity {

  //private double moveSpeed; // horizontal speed

  private Game game; // the game in which the police exists
  
  public FlashPolice(Game g, String r, int newX, int newY) {
    super(r, newX, newY);  // calls the constructor in Entity
    game = g;
  } // constructor

  /* collidedWith
   * input: other - the entity with which the police has collided
   * purpose: notification that the alien has collided
   *          with something
   */
   public void collidedWith(Entity other) {
     // collisions with police are handled in ShotEntity and ShipEntity
   } // collidedWith
  
} // AlienEntity class
