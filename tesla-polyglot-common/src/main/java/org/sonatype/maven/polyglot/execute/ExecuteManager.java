/**
 * Copyright (c) 2012 to original author or authors
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.sonatype.maven.polyglot.execute;

import org.apache.maven.model.Model;

import java.util.List;
import java.util.Map;

/**
 * Manages {@link ExecuteTask}s for a project. Tasks are registered against a model and then the model is
 * installed.
 *
 * @author <a href="mailto:jason@planet57.com">Jason Dillon</a>
 *
 * @since 0.7
 */
public interface ExecuteManager
{
    void register(Model model, List<ExecuteTask> tasks);

    List<ExecuteTask> getTasks(Model model);

    /**
     * @deprecated use install with extra options parameter
     * @param model
     */
    @Deprecated
    void install(Model model);

    void install( Model model, Map<String, ?> options );
}