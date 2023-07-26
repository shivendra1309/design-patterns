package structural.bridge;

import org.junit.Test;

import static org.junit.Assert.*;

public class DeviceTest {
    @org.junit.Test
    public void testDevice() throws Exception {
        Device device = new Radio();
        Remote remote = new BasicRemote(device);
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.volumeUp();
        assertEquals(40, device.getVolume());
        remote.volumeDown();
        assertEquals(30, device.getVolume());
        remote.channelUp();
        assertEquals(2, device.getChannel());
        remote.channelDown();
        assertEquals(1, device.getChannel());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
    }

    @Test
    public void testTv() throws Exception {
        Device device = new Tv();
        Remote remote = new BasicRemote(device);
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.volumeUp();
        assertEquals(40, device.getVolume());
        remote.volumeDown();
        assertEquals(30, device.getVolume());
        remote.channelUp();
        assertEquals(2, device.getChannel());
        remote.channelDown();
        assertEquals(1, device.getChannel());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
        remote.power();
        assertEquals(true, device.isEnabled());
        remote.power();
        assertEquals(false, device.isEnabled());
    }

}
