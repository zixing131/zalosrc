package com.zing.zalo.p062db.zadb;

/* renamed from: com.zing.zalo.db.zadb.a */
/* loaded from: classes3.dex */
public interface InterfaceC7968a {

    /* renamed from: com.zing.zalo.db.zadb.a$a */
    /* loaded from: classes3.dex */
    public enum a {
        DBLOG_TYPE_QOS,
        DBLOG_TYPE_MIGRATE_PROGRESS,
        DBLOG_TYPE_BACKUP_PROGRESS,
        DBLOG_TYPE_RESTORE_DECRYPT_PROGRESS,
        DBLOG_TYPE_RESTORE_TO_DB_PROGRESS,
        DBLOG_TYPE_RESTORE_DECOMPRESS_PROGRESS,
        DBLOG_TYPE_RENEW_ON_CORRUPT,
        DBLOG_TYPE_LOG;


        /* renamed from: p */
        public final int f43411p = ordinal() + 1;

        a() {
        }
    }

    /* renamed from: a */
    void mo42736a(a aVar, int i11, String str, int i12, int i13, int i14, String str2, long j11, long j12, int i15, String str3, boolean z11, int i16);
}
