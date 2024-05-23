package com.zing.zalo.shortvideo.p072ui.presenter;

import android.graphics.Bitmap;
import android.net.Uri;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19059j0;
import h20.InterfaceC19720d;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import m20.InterfaceC22821z;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import q20.AbstractC25089l;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* loaded from: classes5.dex */
public final class CropImagePresenterImpl extends BasePresenterImpl<InterfaceC22821z> implements InterfaceC19720d {

    /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CropImagePresenterImpl$a */
    /* loaded from: classes5.dex */
    static final class C9867a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f51711t;

        /* renamed from: u */
        int f51712u;

        /* renamed from: v */
        final /* synthetic */ Bitmap f51713v;

        /* renamed from: w */
        final /* synthetic */ int f51714w;

        /* renamed from: x */
        final /* synthetic */ int f51715x;

        /* renamed from: y */
        final /* synthetic */ CropImagePresenterImpl f51716y;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.shortvideo.ui.presenter.CropImagePresenterImpl$a$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ CropImagePresenterImpl f51717q;

            /* renamed from: r */
            final /* synthetic */ C19059j0 f51718r;

            /* renamed from: s */
            final /* synthetic */ int f51719s;

            /* renamed from: t */
            final /* synthetic */ int f51720t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CropImagePresenterImpl cropImagePresenterImpl, C19059j0 c19059j0, int i11, int i12) {
                super(0);
                this.f51717q = cropImagePresenterImpl;
                this.f51718r = c19059j0;
                this.f51719s = i11;
                this.f51720t = i12;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: V4 */
            public /* bridge */ /* synthetic */ Object mo12V4() {
                m53164a();
                return C24848g0.f119245a;
            }

            /* renamed from: a */
            public final void m53164a() {
                ((InterfaceC22821z) this.f51717q.m52968s()).mo54229Ui((Uri) this.f51718r.f94941p, this.f51719s, this.f51720t);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9867a(Bitmap bitmap, int i11, int i12, CropImagePresenterImpl cropImagePresenterImpl, Continuation continuation) {
            super(2, continuation);
            this.f51713v = bitmap;
            this.f51714w = i11;
            this.f51715x = i12;
            this.f51716y = cropImagePresenterImpl;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C9867a(this.f51713v, this.f51714w, this.f51715x, this.f51716y, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f51712u;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.f51711t;
                    AbstractC24862s.m129228b(obj);
                    throw th2;
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C19059j0 c19059j0 = new C19059j0();
                try {
                    try {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f51713v, this.f51714w, this.f51715x, true);
                        AbstractC19074t.m100207e(createScaledBitmap, "createScaledBitmap(...)");
                        AbstractC25089l.a aVar = AbstractC25089l.Companion;
                        File file = new File(aVar.m130045a());
                        if (aVar.m130048e(file, createScaledBitmap)) {
                            c19059j0.f94941p = Uri.fromFile(file);
                        }
                        CropImagePresenterImpl cropImagePresenterImpl = this.f51716y;
                        a aVar2 = new a(cropImagePresenterImpl, c19059j0, this.f51714w, this.f51715x);
                        this.f51712u = 1;
                        if (cropImagePresenterImpl.m52971w(aVar2, this) == m142578e) {
                            return m142578e;
                        }
                    } catch (Exception unused) {
                        c19059j0.f94941p = null;
                        CropImagePresenterImpl cropImagePresenterImpl2 = this.f51716y;
                        a aVar3 = new a(cropImagePresenterImpl2, c19059j0, this.f51714w, this.f51715x);
                        this.f51712u = 2;
                        if (cropImagePresenterImpl2.m52971w(aVar3, this) == m142578e) {
                            return m142578e;
                        }
                    }
                } catch (Throwable th3) {
                    CropImagePresenterImpl cropImagePresenterImpl3 = this.f51716y;
                    a aVar4 = new a(cropImagePresenterImpl3, c19059j0, this.f51714w, this.f51715x);
                    this.f51711t = th3;
                    this.f51712u = 3;
                    if (cropImagePresenterImpl3.m52971w(aVar4, this) == m142578e) {
                        return m142578e;
                    }
                    throw th3;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C9867a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    @Override // h20.InterfaceC19720d
    /* renamed from: Ku */
    public void mo53162Ku(Bitmap bitmap, int i11, int i12) {
        AbstractC19074t.m100208f(bitmap, "src");
        ((InterfaceC22821z) m52968s()).mo54230W2();
        BuildersKt__Builders_commonKt.m112540d(m52969u(), null, null, new C9867a(bitmap, i11, i12, this, null), 3, null);
    }
}
