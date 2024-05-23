package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AbstractC6476d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.appupdate.a0 */
/* loaded from: classes3.dex */
public final class C6471a0 extends AbstractC6476d.a {

    /* renamed from: a */
    private int f36274a;

    /* renamed from: b */
    private boolean f36275b;

    /* renamed from: c */
    private byte f36276c;

    @Override // com.google.android.play.core.appupdate.AbstractC6476d.a
    /* renamed from: a */
    public final AbstractC6476d mo33333a() {
        if (this.f36276c != 3) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f36276c & 1) == 0) {
                sb2.append(" appUpdateType");
            }
            if ((this.f36276c & 2) == 0) {
                sb2.append(" allowAssetPackDeletion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        return new C6475c0(this.f36274a, this.f36275b, null);
    }

    @Override // com.google.android.play.core.appupdate.AbstractC6476d.a
    /* renamed from: b */
    public final AbstractC6476d.a mo33334b(boolean z11) {
        this.f36275b = z11;
        this.f36276c = (byte) (this.f36276c | 2);
        return this;
    }

    /* renamed from: c */
    public final AbstractC6476d.a m33335c(int i11) {
        this.f36274a = i11;
        this.f36276c = (byte) (this.f36276c | 1);
        return this;
    }
}
