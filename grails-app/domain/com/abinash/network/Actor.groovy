package com.abinash.network

import org.neo4j.graphdb.Node

/**
 * Created by abastola on 6/13/14.
 */

class Actor {
    private final Node underlyingNode
    private final String NAME="name"
    Actor(Node actorNode)
    {
        this.undelyingNode=actorNode
    }

    String getName() {
        return underlyingNode.getProperty(NAME) as String
    }

    @Override
    public int hashCode()
    {
        return underlyingNode.hashCode();
    }

    @Override
    public boolean equals( Object o )
    {
        return o instanceof Actor &&
                underlyingNode.equals( ( (Actor)o ).getUnderlyingNode() );
    }

    @Override
    public String toString() {
        return "Actor{"+getName()+"}";
    }
}
