/*
 * Copyright Elasticsearch B.V. and/or licensed to Elasticsearch B.V. under one
 * or more contributor license agreements. Licensed under the "Elastic License
 * 2.0", the "GNU Affero General Public License v3.0 only", and the "Server Side
 * Public License v 1"; you may not use this file except in compliance with, at
 * your election, the "Elastic License 2.0", the "GNU Affero General Public
 * License v3.0 only", or the "Server Side Public License, v 1".
 */
package org.elasticsearch.gradle;

public enum PropertyNormalization {
    /**
     * Uses default strategy based on runtime property type.
     */
    DEFAULT,

    /**
     * Ignores property value completely for the purposes of input snapshotting.
     */
    IGNORE_VALUE
}
