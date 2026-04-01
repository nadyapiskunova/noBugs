package part_12.complex_tasks.task_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntityManagerTest{
    User bloom = new User("Bloom", 20, true);
    User stella = new User("Stella", 18, true);
    User musa = new User("Musa", 30, false);

    @Test
    public void testAddEntity(){
        EntityManager<User> manager = new EntityManager<>();
        manager.addEntity(bloom);

        assertEquals(1, manager.getAllEntity().size());
        assertEquals("Bloom", manager.getAllEntity().get(0).getName());
    }

    @Test
    public void testRemoveEntity(){
        EntityManager<User> manager = new EntityManager<>();
        manager.addEntity(bloom);
        manager.addEntity(stella);

        assertTrue(manager.removeEntity(bloom));
        assertEquals(1, manager.getAllEntity().size());
        assertFalse(manager.removeEntity(bloom));
    }

    @Test
    public void testGetEntityFilterByAge(){
        EntityManager<User> manager = new EntityManager<>();
        manager.addEntity(bloom);
        manager.addEntity(stella);
        manager.addEntity(musa);

        assertEquals(2, manager.getEntityFilterByAge(17, 20).size());
    }
    @Test
    public void testGetEntityFilterByName(){
        EntityManager<User> manager = new EntityManager<>();
        manager.addEntity(bloom);
        manager.addEntity(stella);
        manager.addEntity(musa);

        assertEquals(1, manager.getEntityFilterByName("stella").size());
        assertEquals("Stella", manager.getEntityFilterByName("stella").get(0).getName());
    }

    @Test
    public void testGetEntityFilterByIsActive(){
        EntityManager<User> manager = new EntityManager<>();
        manager.addEntity(bloom);
        manager.addEntity(stella);
        manager.addEntity(musa);

        assertEquals(2, manager.getEntityFilterByIsActive(true).size());
    }



}
