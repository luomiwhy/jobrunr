package org.jobrunr.jobs.filters;

import org.jobrunr.configuration.Namespace;
import org.jobrunr.jobs.AbstractJob;
import org.jobrunr.jobs.JobDetails;
import org.jobrunr.jobs.annotations.Job;
import org.jobrunr.utils.JobUtils;
import org.jobrunr.utils.StringUtils;
import org.slf4j.MDC;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NamespaceFilter implements JobClientFilter {

    @Override
    public void onCreating(AbstractJob job) {
        job.setNamespace(Namespace.getInstance().getName());
    }
}
