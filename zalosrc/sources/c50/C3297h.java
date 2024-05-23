package c50;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.backuprestore.widget.SyncBannerCommonView;
import com.zing.zalo.zview.actionbar.ActionBar;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;
import me0.AbstractC23222t7;
import me0.C23212s8;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import p297kd.C21689d;
import p297kd.C21690e;
import p320ld.C22447s;

/* renamed from: c50.h */
/* loaded from: classes5.dex */
public final class C3297h {

    /* renamed from: a */
    public static final C3297h f14104a = new C3297h();

    private C3297h() {
    }

    /* renamed from: a */
    public static final void m16731a(SyncBannerCommonView syncBannerCommonView, int i11) {
        int i12;
        AbstractC19074t.m100208f(syncBannerCommonView, "syncBannerCommonView");
        syncBannerCommonView.setBackgroundColorRes(C23212s8.m119607o(syncBannerCommonView.getContext(), AbstractC16781w.NotificationColor1Background));
        syncBannerCommonView.setHasIconResult(true);
        syncBannerCommonView.setIconResultRes(m16739i(i11));
        syncBannerCommonView.setHasIconClose(true);
        if (i11 == 1) {
            i12 = AbstractC23222t7.f112584s;
        } else {
            i12 = AbstractC23222t7.f112582r;
        }
        syncBannerCommonView.setTextSizeMsgSpanned(i12);
    }

    /* renamed from: b */
    public static final void m16732b(SyncBannerCommonView syncBannerCommonView, int i11) {
        int i12;
        AbstractC19074t.m100208f(syncBannerCommonView, "syncBannerCommonView");
        syncBannerCommonView.setBackgroundColorRes(C23212s8.m119607o(syncBannerCommonView.getContext(), AbstractC16781w.NotificationColor6Background));
        syncBannerCommonView.setHasIconResult(true);
        syncBannerCommonView.setIconResultRes(m16740j(i11));
        syncBannerCommonView.setHasIconClose(true);
        if (i11 == 1) {
            i12 = AbstractC23222t7.f112584s;
        } else {
            i12 = AbstractC23222t7.f112582r;
        }
        syncBannerCommonView.setTextSizeMsgSpanned(i12);
    }

    /* renamed from: c */
    public static final void m16733c(SyncBannerCommonView syncBannerCommonView, int i11) {
        int i12;
        if (syncBannerCommonView != null) {
            syncBannerCommonView.setBackgroundColorRes(C23212s8.m119607o(syncBannerCommonView.getContext(), AbstractC16781w.NotificationColor3Background));
            syncBannerCommonView.setHasIconResult(true);
            syncBannerCommonView.setIconResultRes(m16741k(i11));
            syncBannerCommonView.setHasIconClose(true);
            if (i11 == 1) {
                i12 = AbstractC23222t7.f112584s;
            } else {
                i12 = AbstractC23222t7.f112582r;
            }
            syncBannerCommonView.setTextSizeMsgSpanned(i12);
        }
    }

    /* renamed from: d */
    public static final void m16734d(C3294e c3294e, String str, int i11) {
        C3295f c3295f;
        AbstractC19074t.m100208f(str, "msgText");
        if (c3294e != null) {
            c3294e.m16717e(2);
            c3294e.m16715c().m16724f();
            c3294e.m16718f(0);
        }
        if (c3294e != null) {
            c3295f = c3294e.m16715c();
        } else {
            c3295f = null;
        }
        m16737g(c3295f, str, i11);
    }

    /* renamed from: e */
    public static final void m16735e(C3294e c3294e, String str, int i11) {
        AbstractC19074t.m100208f(str, "msgText");
        if (c3294e != null) {
            c3294e.m16717e(0);
            c3294e.m16715c().m16724f();
            c3294e.m16715c().m16729k(str);
            c3294e.m16718f(i11);
            c3294e.m16715c().m16727i(i11);
        }
    }

    /* renamed from: f */
    public static final void m16736f(C3294e c3294e, String str) {
        AbstractC19074t.m100208f(str, "msgText");
        if (c3294e != null) {
            c3294e.m16717e(1);
            c3294e.m16715c().m16724f();
            c3294e.m16715c().m16729k(str);
            c3294e.m16718f(0);
        }
    }

    /* renamed from: g */
    public static final void m16737g(C3295f c3295f, String str, int i11) {
        int m127173b0;
        int m127173b02;
        String str2;
        int i12;
        AbstractC19074t.m100208f(str, "inputMsgText");
        if (c3295f != null) {
            m127173b0 = AbstractC24342w.m127173b0(str, "#x#", 0, false, 6, null);
            if (m127173b0 != -1) {
                str2 = AbstractC24341v.m127114D(str, "#x#", "", false, 4, null);
                i12 = str2.length();
            } else {
                m127173b02 = AbstractC24342w.m127173b0(str, "#xx#", 0, false, 6, null);
                if (m127173b02 != -1) {
                    str2 = AbstractC24341v.m127114D(str, "#xx#", "", false, 4, null);
                    m127173b0 = 0;
                } else {
                    str2 = str;
                }
                i12 = m127173b02;
            }
            c3295f.m16729k(str2);
            c3295f.m16728j(m127173b0);
            c3295f.m16726h(i12);
            c3295f.m16725g(i11);
        }
    }

    /* renamed from: h */
    public static final String m16738h(String str, C21690e c21690e) {
        boolean m127149O;
        AbstractC19074t.m100208f(str, "msgErrorRaw");
        C21689d c21689d = null;
        m127149O = AbstractC24342w.m127149O(str, "%s", false, 2, null);
        if (m127149O) {
            if (c21690e != null) {
                c21689d = c21690e.m111895u();
            }
            String m116064x = C22447s.m116064x(c21689d);
            C19067n0 c19067n0 = C19067n0.f94947a;
            Object[] objArr = new Object[1];
            if (m116064x == null) {
                m116064x = "";
            }
            objArr[0] = m116064x;
            String format = String.format(str, Arrays.copyOf(objArr, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            return format;
        }
        return str;
    }

    /* renamed from: i */
    public static final int m16739i(int i11) {
        return i11 == 0 ? AbstractC16803z.ic_24_danger : AbstractC16803z.ic_sync_24_error_remote;
    }

    /* renamed from: j */
    public static final int m16740j(int i11) {
        return i11 == 0 ? AbstractC16803z.ic_24_success : AbstractC16803z.ic_sync_24_success_remote;
    }

    /* renamed from: k */
    public static final int m16741k(int i11) {
        return i11 == 0 ? AbstractC16803z.ic_remind_restore : AbstractC16803z.ic_sync_24_warning_remote;
    }

    /* renamed from: n */
    public static final void m16742n(ActionBar actionBar) {
        if (actionBar == null) {
            return;
        }
        actionBar.setTitle("");
        if (C23212s8.m119603k()) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_black);
        } else {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
        }
        actionBar.setBackgroundResource(AbstractC16801x.transparent);
    }

    /* renamed from: o */
    public static final void m16743o(ImageView imageView, int i11) {
        FrameLayout.LayoutParams layoutParams;
        AbstractC19074t.m100208f(imageView, "viewTarget");
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.topMargin = i11;
            layoutParams.rightMargin = i11;
            imageView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: l */
    public final void m16744l(View view) {
        if (view != null && view.getVisibility() == 0) {
            view.setVisibility(8);
        }
    }

    /* renamed from: m */
    public final void m16745m(ProgressBar progressBar, int i11) {
        AbstractC19074t.m100208f(progressBar, "<this>");
        if (Build.VERSION.SDK_INT >= 24 && i11 != 0) {
            progressBar.setProgress(i11, true);
        } else {
            progressBar.setProgress(i11);
        }
    }
}
