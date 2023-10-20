/*
 * Copyright 2023 Amazon.com, Inc. or its affiliates.
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.burt.jmespath.jacksonjr;


import com.fasterxml.jackson.core.TreeNode;
import io.burt.jmespath.Adapter;
import io.burt.jmespath.JmesPathRuntimeTest;
import io.burt.jmespath.RuntimeConfiguration;

public class JacksonJrTest extends JmesPathRuntimeTest<TreeNode> {
    @Override
    protected Adapter<TreeNode> createRuntime(RuntimeConfiguration configuration) {
        return new JacksonJrRuntime(configuration);
    }
}