package ai;

import java.util.HashMap;

public class MCTSNode
{
	public int N;
	public int Value;
	public HashMap<CardInfo, MCTSNode> son = new HashMap<CardInfo, MCTSNode>();
	public CardInfo cardInfo;
	public boolean sonall;
}
