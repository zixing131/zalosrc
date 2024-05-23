package com.zing.zalo.p062db.zadb;

import com.zing.zalo.p062db.SQLiteDatabase;
import com.zing.zalo.p062db.zadb.wrapper.ZdbApiCode;
import gm.C19498i;
import gm.C19502m;
import gm.C19503n;

/* loaded from: classes.dex */
public class ZdbExtend {

    /* renamed from: a */
    private final int f43400a;

    /* renamed from: b */
    private final long f43401b;

    static {
        SQLiteDatabase.m41403I();
    }

    public ZdbExtend(int i11, String str, boolean z11, boolean z12, boolean z13, int i12) {
        this.f43400a = i11;
        this.f43401b = initNativeExtendDB(str, i11, z11, z12, z13, i12);
    }

    /* renamed from: a */
    public int m42796a(int i11, boolean z11, C19498i c19498i, ZdbApiCode zdbApiCode) {
        return deleteReactByMsgIds(this.f43401b, i11, z11, c19498i.m101945d(), zdbApiCode);
    }

    /* renamed from: b */
    public int m42797b(int i11, boolean z11, C19502m c19502m, ZdbApiCode zdbApiCode) {
        return deleteReactByReactIds(this.f43401b, i11, z11, c19502m.m101951b(), zdbApiCode);
    }

    /* renamed from: c */
    public int m42798c(int i11, boolean z11, C19502m c19502m, ZdbApiCode zdbApiCode) {
        return deleteReactBySenderIds(this.f43401b, i11, z11, c19502m.m101951b(), zdbApiCode);
    }

    /* renamed from: d */
    public int m42799d(int i11, boolean z11, ZdbApiCode zdbApiCode) {
        return deleteReactByThread(this.f43401b, i11, z11, zdbApiCode);
    }

    native int deleteReactByMsgIds(long j11, int i11, boolean z11, byte[] bArr, ZdbApiCode zdbApiCode);

    native int deleteReactByReactIds(long j11, int i11, boolean z11, byte[] bArr, ZdbApiCode zdbApiCode);

    native int deleteReactBySenderIds(long j11, int i11, boolean z11, byte[] bArr, ZdbApiCode zdbApiCode);

    native int deleteReactByThread(long j11, int i11, boolean z11, ZdbApiCode zdbApiCode);

    /* renamed from: e */
    public int m42800e() {
        return this.f43400a;
    }

    /* renamed from: f */
    public long[] m42801f(int i11, boolean z11, C19503n c19503n, ZdbApiCode zdbApiCode) {
        return insertReaction(this.f43401b, i11, z11, c19503n.m101956e(), zdbApiCode);
    }

    /* renamed from: g */
    public C19503n m42802g(int i11, boolean z11, C19498i c19498i, boolean z12, ZdbApiCode zdbApiCode) {
        byte[] loadReactByMsgIds = loadReactByMsgIds(this.f43401b, i11, z11, c19498i.m101945d(), z12, zdbApiCode);
        C19503n c19503n = new C19503n();
        c19503n.m101953b(loadReactByMsgIds);
        return c19503n;
    }

    /* renamed from: h */
    public void m42803h() {
        releaseNativeExtendDB(this.f43401b);
    }

    /* renamed from: i */
    public int m42804i(int i11, boolean z11) {
        return setExtDBLogLevel(this.f43401b, i11, z11);
    }

    native long initNativeExtendDB(String str, int i11, boolean z11, boolean z12, boolean z13, int i12);

    native long[] insertReaction(long j11, int i11, boolean z11, byte[] bArr, ZdbApiCode zdbApiCode);

    /* renamed from: j */
    public void m42805j() {
        setMigrateComplete(this.f43401b);
    }

    /* renamed from: k */
    public void m42806k(String str) {
        startMigrateReactionDB(this.f43401b, str);
    }

    /* renamed from: l */
    public int m42807l(int i11, boolean z11, C19503n c19503n, ZdbApiCode zdbApiCode) {
        return updateReaction(this.f43401b, i11, z11, c19503n.m101956e(), zdbApiCode);
    }

    native byte[] loadReactByMsgIds(long j11, int i11, boolean z11, byte[] bArr, boolean z12, ZdbApiCode zdbApiCode);

    native byte[] loadReactByReactIds(long j11, int i11, boolean z11, byte[] bArr, ZdbApiCode zdbApiCode);

    native int releaseNativeExtendDB(long j11);

    native int replaceReaction(long j11, int i11, boolean z11, byte[] bArr, ZdbApiCode zdbApiCode);

    native int setExtDBLogLevel(long j11, int i11, boolean z11);

    native int setMigrateComplete(long j11);

    native int startMigrateReactionDB(long j11, String str);

    native int stopMigrate(long j11);

    native int updateReaction(long j11, int i11, boolean z11, byte[] bArr, ZdbApiCode zdbApiCode);
}
