package org.pokenet.client.network;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.pokenet.client.GameClient;
import org.pokenet.client.backend.entity.Player;
import org.pokenet.client.backend.entity.Player.Direction;

/**
 * Protocol handler for UDP
 * @author shadowkanji
 *
 */
public class UdpProtocolHandler extends IoHandlerAdapter {
	private GameClient m_game;

	/**
	 * Constructor
	 * @param gameClient
	 */
	public UdpProtocolHandler(GameClient gc) {
		m_game = gc;
	}

	/**
	 * Called when a message is received
	 */
	public void messageReceived(IoSession session, Object m) {

	}
}