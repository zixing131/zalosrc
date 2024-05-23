package com.zing.zalo.p062db;

import am.C0918j0;
import fn0.AbstractC19060k;
import mm0.AbstractC23350e;

/* renamed from: com.zing.zalo.db.i */
/* loaded from: classes.dex */
public final class C7964i {
    public static final a Companion = new a(null);

    /* renamed from: com.zing.zalo.db.i$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C7964i m42676a() {
            return b.f43361a.m42677a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.db.i$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public static final b f43361a = new b();

        /* renamed from: b */
        private static final C7964i f43362b = new C7964i(null);

        private b() {
        }

        /* renamed from: a */
        public final C7964i m42677a() {
            return f43362b;
        }
    }

    private C7964i() {
    }

    public /* synthetic */ C7964i(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: a */
    public final void m42675a() {
        try {
            C0918j0 m42200M6 = C7960e.m41971c6().m42200M6();
            m42200M6.m2865f("drop table if exists tbl_cache_group_media_store_media");
            m42200M6.m2865f("drop table if exists tbl_cache_group_media_store_link");
            m42200M6.m2865f("drop table if exists tbl_cache_group_media_store_file");
            m42200M6.m2865f("drop table if exists tbl_media_store_media_metadata_v2");
            m42200M6.m2865f("drop table if exists tbl_media_store_link_metadata_v2");
            m42200M6.m2865f("drop table if exists tbl_media_store_file_metadata_v2");
            m42200M6.m2865f("drop table if exists tbl_cache_group_media_store_preview_album");
            m42200M6.m2865f("drop table if exists tbl_media_store_random_memories");
            m42200M6.m2865f("drop table if exists tbl_media_store_memory_following_group_info");
            m42200M6.m2865f("drop table if exists table_cache_processing_items_of_collections");
            m42200M6.m2865f("drop table if exists tbl_cache_group_media_store_info");
            m42200M6.m2865f("drop table if exists table_media_store_media_item_cache_new");
            m42200M6.m2865f("drop table if exists table_media_store_link_item_cache_new");
            m42200M6.m2865f("drop table if exists table_media_store_file_item_cache_new");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }
}
