package me0;

import com.zing.zalo.camera.ZaloCameraView;
import com.zing.zalo.feed.mvp.album.ProfileAlbumCreateView;
import com.zing.zalo.p077ui.zviews.FeedDetailsView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.ImageCommentView;
import com.zing.zalo.p077ui.zviews.StoryDetailsView;
import com.zing.zalo.p077ui.zviews.UpdateStatusView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoBioView;
import com.zing.zalo.p077ui.zviews.UpdateUserInfoZView;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18509p;
import gq.C19587j;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import p691yr.C31066p;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: me0.e8 */
/* loaded from: classes4.dex */
public final class C23058e8 {

    /* renamed from: a */
    public static final C23058e8 f112065a = new C23058e8();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.e8$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f112066t;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f112066t;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC24862s.m129228b(obj);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C31066p c31066p = new C31066p(null, 1, null);
                this.f112066t = 1;
                if (c31066p.m101503a(this) == m142578e) {
                    return m142578e;
                }
            }
            C19587j c19587j = C19587j.f97307a;
            this.f112066t = 2;
            if (c19587j.m102532h(this) == m142578e) {
                return m142578e;
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    private C23058e8() {
    }

    /* renamed from: a */
    public final void m118308a() {
        BuildersKt__Builders_commonKt.m112540d(GlobalScope.f105887p, Dispatchers.m112680b(), null, new a(null), 2, null);
    }

    /* renamed from: b */
    public final boolean m118309b(ZaloView zaloView) {
        boolean z11;
        if (zaloView == null) {
            return false;
        }
        if (!(zaloView instanceof ProfileAlbumCreateView) && ((!(zaloView instanceof ZaloCameraView) || ((ZaloCameraView) zaloView).m39059lQ() != 7) && !(zaloView instanceof FeedDetailsView) && !(zaloView instanceof ImageCommentView) && ((!((z11 = zaloView instanceof FrameLayoutKeepBtmSheetZaloView)) || ((FrameLayoutKeepBtmSheetZaloView) zaloView).m79790fM() != 2) && !(zaloView instanceof StoryDetailsView) && ((!z11 || ((FrameLayoutKeepBtmSheetZaloView) zaloView).m79790fM() != 9) && !(zaloView instanceof UpdateStatusView) && !(zaloView instanceof UpdateUserInfoBioView) && !(zaloView instanceof UpdateUserInfoZView))))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m118310c(ZaloView zaloView) {
        if (zaloView == null) {
            return false;
        }
        if (!(zaloView instanceof FeedDetailsView) && !(zaloView instanceof ImageCommentView) && (!(zaloView instanceof FrameLayoutKeepBtmSheetZaloView) || ((FrameLayoutKeepBtmSheetZaloView) zaloView).m79790fM() != 2)) {
            return false;
        }
        return true;
    }
}
