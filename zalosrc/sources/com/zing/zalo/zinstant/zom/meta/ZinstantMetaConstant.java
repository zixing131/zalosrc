package com.zing.zalo.zinstant.zom.meta;

import fn0.AbstractC19060k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public final class ZinstantMetaConstant {
    public static final Companion Companion = new Companion(null);
    public static final String IMPRESSION_META_INTERVAL = "interval";
    public static final String IMPRESSION_META_NAME = "impression";
    public static final String IMPRESSION_META_TYPE = "type";
    public static final String MEMORY_CACHING = "memory_caching";
    public static final String MEMORY_CACHING_ALLOW_REUSE_NODE = "reuse";
    public static final String MEMORY_CACHING_ALLOW_REUSE_NODE_VALUE_NO = "no";
    public static final String MEMORY_CACHING_ALLOW_REUSE_NODE_VALUE_YES = "yes";
    public static final String MEMORY_CACHING_CONTENT_CACHE = "cache";
    public static final String MEMORY_CACHING_CONTENT_CACHE_VALUE_NO = "no";
    public static final String MEMORY_CACHING_CONTENT_CACHE_VALUE_YES = "yes";
    public static final String TARGET_VIEWPORT = "target";
    public static final String TIME_ON_SCREEN_META_NAME = "time-on-screen";
    public static final String VIEWPORT = "viewport";

    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes7.dex */
    public @interface ImpressionType {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int all = 2;
        public static final int auto_interval = 1;
        public static final int user_interaction = 0;

        /* loaded from: classes7.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int all = 2;
            public static final int auto_interval = 1;
            public static final int user_interaction = 0;

            private Companion() {
            }
        }
    }
}
