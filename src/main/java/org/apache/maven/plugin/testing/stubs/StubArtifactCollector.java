package org.apache.maven.plugin.testing.stubs;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.maven.artifact.Artifact;
import org.apache.maven.artifact.metadata.ArtifactMetadataSource;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.artifact.repository.RepositoryRequest;
import org.apache.maven.artifact.resolver.ArtifactCollector;
import org.apache.maven.artifact.resolver.ArtifactResolutionException;
import org.apache.maven.artifact.resolver.ArtifactResolutionRequest;
import org.apache.maven.artifact.resolver.ArtifactResolutionResult;
import org.apache.maven.artifact.resolver.ResolutionListener;
import org.apache.maven.artifact.resolver.filter.ArtifactFilter;
import org.apache.maven.repository.legacy.resolver.conflict.ConflictResolver;

/**
 * @author <a href="mailto:brianf@apache.org">Brian Fox</a>
 * @version $Id: StubArtifactCollector.java 834917 2009-11-11 15:40:37Z olamy $
 */
public class StubArtifactCollector
    implements ArtifactCollector
{
    /**
     * Default constructor
     */
    public StubArtifactCollector()
    {
        super();
    }

    public ArtifactResolutionResult collect( Set<Artifact> artifacts, Artifact originatingArtifact,
                                             Map managedVersions, ArtifactResolutionRequest repositoryRequest,
                                             ArtifactMetadataSource source, ArtifactFilter filter,
                                             List<ResolutionListener> listeners,
                                             List<ConflictResolver> conflictResolvers )
    {
        return new ArtifactResolutionResult();
    }

    public ArtifactResolutionResult collect( Set<Artifact> artifacts, Artifact originatingArtifact,
                                             Map managedVersions, ArtifactRepository localRepository,
                                             List<ArtifactRepository> remoteRepositories,
                                             ArtifactMetadataSource source, ArtifactFilter filter,
                                             List<ResolutionListener> listeners,
                                             List<ConflictResolver> conflictResolvers )
    {
        return new ArtifactResolutionResult();
    }

    public ArtifactResolutionResult collect( Set<Artifact> artifacts, Artifact originatingArtifact,
                                             Map managedVersions, ArtifactRepository localRepository,
                                             List<ArtifactRepository> remoteRepositories,
                                             ArtifactMetadataSource source, ArtifactFilter filter,
                                             List<ResolutionListener> listeners )
    {
        return new ArtifactResolutionResult();
    }

    public ArtifactResolutionResult collect( Set<Artifact> artifacts, Artifact originatingArtifact,
                                             ArtifactRepository localRepository,
                                             List<ArtifactRepository> remoteRepositories,
                                             ArtifactMetadataSource source, ArtifactFilter filter,
                                             List<ResolutionListener> listeners )
        throws ArtifactResolutionException
    {
        return new ArtifactResolutionResult();
    }

}