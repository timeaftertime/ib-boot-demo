package cn.milai.ib.demo.character.explosion;

import cn.milai.ib.character.explosion.AbstractExplosion;
import cn.milai.ib.container.Container;

/**
 * 默认的爆炸实现
 * 2019.11.29
 * @author milai
 */
public class BaseExplosion extends AbstractExplosion {

	public BaseExplosion(int x, int y, Container container) {
		super(x, y, container);
	}

}