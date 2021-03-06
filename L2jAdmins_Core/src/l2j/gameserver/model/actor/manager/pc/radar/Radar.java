package l2j.gameserver.model.actor.manager.pc.radar;

import java.util.ArrayList;
import java.util.List;

import l2j.gameserver.model.actor.instance.L2PcInstance;
import l2j.gameserver.network.external.server.RadarControl;

public class Radar
{
	private final L2PcInstance player;
	private final List<RadarMarkerHolder> markers = new ArrayList<>();
	
	public Radar(L2PcInstance player)
	{
		this.player = player;
	}
	
	// Add a marker to player's radar
	public void addRadarMarker(int x, int y, int z)
	{
		markers.add(new RadarMarkerHolder(x, y, z));
		player.sendPacket(new RadarControl(2, 2, x, y, z));
		player.sendPacket(new RadarControl(0, 1, x, y, z));
	}
	
	// Remove a marker from player's radar
	public void removeRadarMarker(int x, int y, int z)
	{
		markers.remove(new RadarMarkerHolder(x, y, z));
		player.sendPacket(new RadarControl(1, 1, x, y, z));
	}
	
	public void removeAllRadarMarkers()
	{
		for (RadarMarkerHolder tempMarker : markers)
		{
			player.sendPacket(new RadarControl(2, 2, tempMarker.x, tempMarker.y, tempMarker.z));
		}
		
		markers.clear();
	}
	
	public void loadRadarMarkers()
	{
		player.sendPacket(new RadarControl(2, 2, player.getX(), player.getY(), player.getZ()));
		for (RadarMarkerHolder tempMarker : markers)
		{
			player.sendPacket(new RadarControl(0, 1, tempMarker.x, tempMarker.y, tempMarker.z));
		}
	}
}
