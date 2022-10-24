package com.example.domain.util.builder;

import com.example.domain.command.impl.entity.Segment;

public interface SegmentBuilder {

    SegmentBuilder withName(String name);

    Segment build();
}
