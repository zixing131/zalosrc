package com.zing.zalo.p077ui.moduleview.search;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.AbstractC1388a;
import androidx.core.content.res.AbstractC1401h;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7354t0;
import com.zing.zalo.control.MediaStoreItem;
import com.zing.zalo.p077ui.custom.C11874v;
import com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView;
import com.zing.zalo.p077ui.moduleview.search.MediaStoreItemFileModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.AbstractC17450b;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hd0.C20003a;
import id0.C20518d;
import java.util.Calendar;
import kd0.C21691a;
import kd0.C21693c;
import l80.C22124b0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import me0.AbstractC23222t7;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23995f;
import p379o3.C23999j;
import p620wt.AbstractC29233h;
import p620wt.InterfaceC29232g;
import p698yz.AbstractC31111g;
import p698yz.EnumC31105a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import th.AbstractC26687h;
import th.C26686g;
import ui0.C27280g;
import vg.AbstractC28236y3;

/* loaded from: classes6.dex */
public final class MediaStoreItemFileModuleView extends ModulesView {

    /* renamed from: K */
    private final int f65080K;

    /* renamed from: L */
    private final int f65081L;

    /* renamed from: M */
    private final int f65082M;

    /* renamed from: N */
    private final int f65083N;

    /* renamed from: O */
    private final int f65084O;

    /* renamed from: P */
    private C11874v f65085P;

    /* renamed from: Q */
    private C21693c f65086Q;

    /* renamed from: R */
    private C22126c0 f65087R;

    /* renamed from: S */
    private C22124b0 f65088S;

    /* renamed from: T */
    private C22126c0 f65089T;

    /* renamed from: U */
    private C22124b0 f65090U;

    /* renamed from: V */
    private C22126c0 f65091V;

    /* renamed from: W */
    private C21693c f65092W;

    /* renamed from: a0 */
    private C3977j f65093a0;

    /* renamed from: b0 */
    private C16716d f65094b0;

    /* renamed from: c0 */
    private InterfaceC12450a f65095c0;

    /* renamed from: d0 */
    private C16719g f65096d0;

    /* renamed from: e0 */
    private C23528a f65097e0;

    /* renamed from: f0 */
    private C21691a f65098f0;

    /* renamed from: g0 */
    private Drawable f65099g0;

    /* renamed from: h0 */
    private Drawable f65100h0;

    /* renamed from: i0 */
    private boolean f65101i0;

    /* renamed from: j0 */
    private boolean f65102j0;

    /* renamed from: k0 */
    private String f65103k0;

    /* renamed from: l0 */
    private MediaStoreItem f65104l0;

    /* renamed from: m0 */
    private EnumC31105a f65105m0;

    /* renamed from: n0 */
    private final InterfaceC29232g f65106n0;

    /* renamed from: o0 */
    private final InterfaceC24854k f65107o0;

    /* renamed from: com.zing.zalo.ui.moduleview.search.MediaStoreItemFileModuleView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC12450a {
        /* renamed from: a */
        void mo69898a(View view);

        /* renamed from: b */
        void mo69899b(View view);

        /* renamed from: c */
        void mo69900c(MediaStoreItem mediaStoreItem, boolean z11);

        /* renamed from: d */
        void mo69901d(MediaStoreItemFileModuleView mediaStoreItemFileModuleView);

        /* renamed from: e */
        void mo69902e(MediaStoreItemFileModuleView mediaStoreItemFileModuleView);
    }

    /* renamed from: com.zing.zalo.ui.moduleview.search.MediaStoreItemFileModuleView$b */
    /* loaded from: classes6.dex */
    public static final class C12451b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C11874v f65108l1;

        /* renamed from: m1 */
        final /* synthetic */ MediaStoreItemFileModuleView f65109m1;

        /* renamed from: n1 */
        final /* synthetic */ boolean f65110n1;

        C12451b(C11874v c11874v, MediaStoreItemFileModuleView mediaStoreItemFileModuleView, boolean z11) {
            this.f65108l1 = c11874v;
            this.f65109m1 = mediaStoreItemFileModuleView;
            this.f65110n1 = z11;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            try {
                if (AbstractC19074t.m100204b(this.f65108l1.m89133b0(), str) && c3979l != null) {
                    this.f65108l1.m89087B0(AbstractC16803z.bg_border_thumb_media_store);
                    C3977j c3977j = this.f65109m1.f65093a0;
                    AbstractC19074t.m100205c(c3977j);
                    c3977j.setImageInfo(c3979l, false);
                    if (this.f65110n1) {
                        this.f65108l1.mo111924u1(c3979l.m18839c());
                    } else {
                        this.f65108l1.mo111924u1(c3979l.m18839c());
                        this.f65108l1.m89135c1(new C20518d().m106593j(200L));
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.search.MediaStoreItemFileModuleView$c */
    /* loaded from: classes6.dex */
    static final class C12452c extends AbstractC19075u implements InterfaceC18494a {
        C12452c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Drawable mo12V4() {
            return AbstractC23136l9.m118665N(MediaStoreItemFileModuleView.this.getContext(), AbstractC16803z.icn_folder);
        }
    }

    /* renamed from: com.zing.zalo.ui.moduleview.search.MediaStoreItemFileModuleView$d */
    /* loaded from: classes6.dex */
    static final class C12453d extends AbstractC19075u implements InterfaceC18494a {
        C12453d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(MediaStoreItemFileModuleView.this.getContext(), 80.0f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreItemFileModuleView(Context context, boolean z11, boolean z12) {
        super(context);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f65080K = AbstractC23136l9.m118742r(12.0f);
        this.f65081L = AbstractC23136l9.m118742r(48.0f);
        this.f65082M = AbstractC23136l9.m118742r(48.0f);
        this.f65083N = AbstractC23136l9.m118742r(16.0f);
        this.f65084O = AbstractC23136l9.m118712h(getContext(), 1.0f);
        this.f65102j0 = true;
        this.f65105m0 = EnumC31105a.f143330q;
        this.f65106n0 = AbstractC29233h.m145990a(new C12452c());
        m129210a = AbstractC24856m.m129210a(new C12453d());
        this.f65107o0 = m129210a;
        this.f65101i0 = z11;
        this.f65102j0 = z12;
        m69895h0(context);
    }

    /* renamed from: e0 */
    private final void m69883e0() {
        Drawable m6964f;
        MediaStoreItem mediaStoreItem = this.f65104l0;
        if (mediaStoreItem != null) {
            AbstractC19074t.m100205c(mediaStoreItem);
            if (mediaStoreItem.m40582Z()) {
                m6964f = AbstractC1388a.m6964f(getContext(), AbstractC16803z.ic_media_file_downloaded);
            } else {
                MediaStoreItem mediaStoreItem2 = this.f65104l0;
                AbstractC19074t.m100205c(mediaStoreItem2);
                if (AbstractC26687h.m137061b(mediaStoreItem2)) {
                    m6964f = null;
                } else {
                    m6964f = AbstractC1388a.m6964f(getContext(), AbstractC16803z.ic_media_file_download);
                }
            }
            C22124b0 c22124b0 = this.f65088S;
            if (c22124b0 == null) {
                AbstractC19074t.m100223u("tvSubtitle");
                c22124b0 = null;
            }
            c22124b0.m115402s1(m6964f, null, null, null);
        }
    }

    /* renamed from: f0 */
    private final void m69884f0() {
        boolean z11;
        String string;
        MediaStoreItem mediaStoreItem = this.f65104l0;
        if (mediaStoreItem == null) {
            return;
        }
        AbstractC19074t.m100205c(mediaStoreItem);
        C22126c0 c22126c0 = null;
        if (AbstractC26687h.m137065f(mediaStoreItem.m40599m().mo95039W2(), mediaStoreItem.m40599m().m95238r3())) {
            String mo95039W2 = mediaStoreItem.m40599m().mo95039W2();
            AbstractC19074t.m100207e(mo95039W2, "getOwnerId(...)");
            C26686g m137060a = AbstractC26687h.m137060a(mo95039W2);
            if (m137060a == null) {
                C22126c0 c22126c02 = this.f65089T;
                if (c22126c02 == null) {
                    AbstractC19074t.m100223u("tvExpirationInfo");
                } else {
                    c22126c0 = c22126c02;
                }
                c22126c0.mo44614b1(8);
                return;
            }
            C22126c0 c22126c03 = this.f65089T;
            if (c22126c03 == null) {
                AbstractC19074t.m100223u("tvExpirationInfo");
                c22126c03 = null;
            }
            c22126c03.mo44614b1(0);
            long m137056d = m137060a.m137056d();
            long m95313z4 = mediaStoreItem.m40599m().m95313z4();
            if (System.currentTimeMillis() - m95313z4 >= m137056d) {
                z11 = true;
            } else {
                z11 = false;
            }
            C22126c0 c22126c04 = this.f65089T;
            if (c22126c04 == null) {
                AbstractC19074t.m100223u("tvExpirationInfo");
            } else {
                c22126c0 = c22126c04;
            }
            if (z11) {
                string = getContext().getString(AbstractC8020f0.str_msg_file_expired);
            } else {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(m95313z4 + m137056d);
                String m119240c0 = AbstractC23160o0.m119240c0(calendar);
                AbstractC19074t.m100207e(m119240c0, "getDdMmYyyySlashStr(...)");
                string = getContext().getString(AbstractC8020f0.str_msg_file_expires_on, m119240c0);
            }
            c22126c0.m111959G1(string);
            return;
        }
        C22126c0 c22126c05 = this.f65089T;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("tvExpirationInfo");
        } else {
            c22126c0 = c22126c05;
        }
        c22126c0.mo44614b1(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m69885g0() {
        Drawable drawable;
        String str;
        float f11;
        int i11;
        Drawable drawable2;
        C22124b0 c22124b0;
        C22124b0 c22124b02;
        C22124b0 c22124b03;
        C22124b0 c22124b04;
        C22124b0 c22124b05;
        C11874v c11874v;
        C22126c0 c22126c0;
        C22124b0 c22124b06;
        C22126c0 c22126c02;
        C21693c c21693c;
        MediaStoreItem mediaStoreItem = this.f65104l0;
        int m119607o = C23212s8.m119607o(getContext(), AbstractC7354t0.NotificationColor1);
        int i12 = 0;
        C22126c0 c22126c03 = null;
        String str2 = "";
        if (mediaStoreItem != null && !mediaStoreItem.m40582Z()) {
            if (mediaStoreItem.m40596j0()) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                Drawable m139658a = C27280g.m139658a(context, AbstractC16803z.ic_file_rolled_indicator);
                AbstractC19074t.m100205c(m139658a);
                int i13 = AbstractC23222t7.f112586t;
                m139658a.setBounds(0, 0, i13, i13);
                String string = getContext().getString(AbstractC8020f0.str_rolled_file);
                AbstractC19074t.m100207e(string, "getString(...)");
                str = string;
                f11 = 0.5f;
                i11 = AbstractC1401h.m7080d(getResources(), AbstractC2808b.f150840y70, getContext().getTheme());
                drawable2 = m139658a;
                drawable = null;
            } else if (mediaStoreItem.m40583a0()) {
                str2 = getContext().getString(AbstractC8020f0.str_error_download_file);
                AbstractC19074t.m100207e(str2, "getString(...)");
                m119607o = C23212s8.m119607o(getContext(), AbstractC7354t0.NotificationColor1);
            } else {
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                drawable = C27280g.m139660c(context2, AbstractC2810d.zds_ic_download_solid_16, AbstractC2807a.border_selected);
                str = "";
                f11 = 1.0f;
                i11 = m119607o;
                drawable2 = null;
            }
            c22124b0 = this.f65088S;
            if (c22124b0 == null) {
                AbstractC19074t.m100223u("tvSubtitle");
                c22124b0 = null;
            }
            c22124b0.m115400q1(drawable, null, null, null);
            c22124b02 = this.f65090U;
            if (c22124b02 == null) {
                AbstractC19074t.m100223u("tvError");
                c22124b02 = null;
            }
            c22124b02.f108888M0.m111959G1(str);
            c22124b03 = this.f65090U;
            if (c22124b03 == null) {
                AbstractC19074t.m100223u("tvError");
                c22124b03 = null;
            }
            c22124b03.f108888M0.m111962J1(i11);
            c22124b04 = this.f65090U;
            if (c22124b04 == null) {
                AbstractC19074t.m100223u("tvError");
                c22124b04 = null;
            }
            if (str.length() == 0) {
                i12 = 8;
            }
            c22124b04.mo44614b1(i12);
            c22124b05 = this.f65090U;
            if (c22124b05 == null) {
                AbstractC19074t.m100223u("tvError");
                c22124b05 = null;
            }
            c22124b05.m115400q1(drawable2, null, null, null);
            c11874v = this.f65085P;
            if (c11874v == null) {
                AbstractC19074t.m100223u("imvThumb");
                c11874v = null;
            }
            c11874v.mo89158x0(f11);
            c22126c0 = this.f65087R;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("tvTitle");
                c22126c0 = null;
            }
            c22126c0.mo89158x0(f11);
            c22124b06 = this.f65088S;
            if (c22124b06 == null) {
                AbstractC19074t.m100223u("tvSubtitle");
                c22124b06 = null;
            }
            c22124b06.mo89158x0(f11);
            c22126c02 = this.f65089T;
            if (c22126c02 != null) {
                AbstractC19074t.m100223u("tvExpirationInfo");
            } else {
                c22126c03 = c22126c02;
            }
            c22126c03.mo89158x0(f11);
            c21693c = this.f65092W;
            if (c21693c == null) {
                c21693c.mo89158x0(f11);
                return;
            }
            return;
        }
        drawable = null;
        str = str2;
        f11 = 1.0f;
        i11 = m119607o;
        drawable2 = null;
        c22124b0 = this.f65088S;
        if (c22124b0 == null) {
        }
        c22124b0.m115400q1(drawable, null, null, null);
        c22124b02 = this.f65090U;
        if (c22124b02 == null) {
        }
        c22124b02.f108888M0.m111959G1(str);
        c22124b03 = this.f65090U;
        if (c22124b03 == null) {
        }
        c22124b03.f108888M0.m111962J1(i11);
        c22124b04 = this.f65090U;
        if (c22124b04 == null) {
        }
        if (str.length() == 0) {
        }
        c22124b04.mo44614b1(i12);
        c22124b05 = this.f65090U;
        if (c22124b05 == null) {
        }
        c22124b05.m115400q1(drawable2, null, null, null);
        c11874v = this.f65085P;
        if (c11874v == null) {
        }
        c11874v.mo89158x0(f11);
        c22126c0 = this.f65087R;
        if (c22126c0 == null) {
        }
        c22126c0.mo89158x0(f11);
        c22124b06 = this.f65088S;
        if (c22124b06 == null) {
        }
        c22124b06.mo89158x0(f11);
        c22126c02 = this.f65089T;
        if (c22126c02 != null) {
        }
        c22126c03.mo89158x0(f11);
        c21693c = this.f65092W;
        if (c21693c == null) {
        }
    }

    private final Drawable getIcnFolderDrawable() {
        return (Drawable) this.f65106n0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0 */
    public static final void m69886i0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, C16719g c16719g) {
        C21691a c21691a;
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        if (mediaStoreItemFileModuleView.f65101i0 && (c21691a = mediaStoreItemFileModuleView.f65098f0) != null) {
            AbstractC19074t.m100205c(c21691a);
            AbstractC19074t.m100205c(mediaStoreItemFileModuleView.f65098f0);
            c21691a.m111904i1(!r1.m89141i0(), true);
            return;
        }
        InterfaceC12450a interfaceC12450a = mediaStoreItemFileModuleView.f65095c0;
        if (interfaceC12450a != null) {
            AbstractC19074t.m100205c(interfaceC12450a);
            interfaceC12450a.mo69902e(mediaStoreItemFileModuleView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m69887j0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, C16719g c16719g) {
        C21691a c21691a;
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        if (mediaStoreItemFileModuleView.f65101i0 && (c21691a = mediaStoreItemFileModuleView.f65098f0) != null) {
            AbstractC19074t.m100205c(c21691a);
            AbstractC19074t.m100205c(mediaStoreItemFileModuleView.f65098f0);
            c21691a.m111904i1(!r1.m89141i0(), true);
            return;
        }
        InterfaceC12450a interfaceC12450a = mediaStoreItemFileModuleView.f65095c0;
        if (interfaceC12450a != null) {
            AbstractC19074t.m100205c(interfaceC12450a);
            interfaceC12450a.mo69898a(mediaStoreItemFileModuleView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k0 */
    public static final void m69888k0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, View view) {
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        InterfaceC12450a interfaceC12450a = mediaStoreItemFileModuleView.f65095c0;
        if (interfaceC12450a != null) {
            AbstractC19074t.m100205c(interfaceC12450a);
            interfaceC12450a.mo69902e(mediaStoreItemFileModuleView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l0 */
    public static final void m69889l0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, C11874v c11874v, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        AbstractC19074t.m100208f(c11874v, "$this_apply");
        if (mediaStoreItemFileModuleView.f65095c0 != null) {
            if (c11874v.m65985B1() == 1) {
                InterfaceC12450a interfaceC12450a = mediaStoreItemFileModuleView.f65095c0;
                AbstractC19074t.m100205c(interfaceC12450a);
                interfaceC12450a.mo69901d(mediaStoreItemFileModuleView);
            } else {
                InterfaceC12450a interfaceC12450a2 = mediaStoreItemFileModuleView.f65095c0;
                AbstractC19074t.m100205c(interfaceC12450a2);
                interfaceC12450a2.mo69902e(mediaStoreItemFileModuleView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public static final void m69890m0(C21691a c21691a, MediaStoreItemFileModuleView mediaStoreItemFileModuleView, Context context, C16719g c16719g, boolean z11) {
        AbstractC19074t.m100208f(c21691a, "$this_apply");
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        AbstractC19074t.m100208f(context, "$context");
        if (c21691a.m89141i0()) {
            mediaStoreItemFileModuleView.setBackgroundColor(C23212s8.m119607o(context, AbstractC17450b.ItemBackgroundSelectedColor2));
        } else {
            mediaStoreItemFileModuleView.setBackgroundColor(0);
        }
        InterfaceC12450a interfaceC12450a = mediaStoreItemFileModuleView.f65095c0;
        if (interfaceC12450a != null) {
            AbstractC19074t.m100205c(interfaceC12450a);
            interfaceC12450a.mo69900c(mediaStoreItemFileModuleView.f65104l0, c21691a.m89141i0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public static final void m69891n0(MediaStoreItemFileModuleView mediaStoreItemFileModuleView, C16719g c16719g) {
        AbstractC19074t.m100208f(mediaStoreItemFileModuleView, "this$0");
        AbstractC23647d.m123897g("1001526");
        InterfaceC12450a interfaceC12450a = mediaStoreItemFileModuleView.f65095c0;
        if (interfaceC12450a != null) {
            AbstractC19074t.m100205c(interfaceC12450a);
            interfaceC12450a.mo69899b(mediaStoreItemFileModuleView);
        }
    }

    /* renamed from: p0 */
    private final void m69892p0() {
        C11874v c11874v = this.f65085P;
        C11874v c11874v2 = null;
        if (c11874v == null) {
            AbstractC19074t.m100223u("imvThumb");
            c11874v = null;
        }
        c11874v.m65986D1(0);
        C11874v c11874v3 = this.f65085P;
        if (c11874v3 == null) {
            AbstractC19074t.m100223u("imvThumb");
        } else {
            c11874v2 = c11874v3;
        }
        c11874v2.m65987E1(0);
    }

    /* renamed from: r0 */
    private final void m69893r0() {
        if (this.f65104l0 != null) {
            C21691a c21691a = this.f65098f0;
            if (c21691a != null) {
                AbstractC19074t.m100205c(c21691a);
                MediaStoreItem mediaStoreItem = this.f65104l0;
                AbstractC19074t.m100205c(mediaStoreItem);
                c21691a.mo89091D0(mediaStoreItem.m40597k0());
            }
            MediaStoreItem mediaStoreItem2 = this.f65104l0;
            AbstractC19074t.m100205c(mediaStoreItem2);
            if (mediaStoreItem2.m40597k0()) {
                setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC17450b.ItemBackgroundSelectedColor2));
                return;
            } else {
                setBackgroundColor(0);
                return;
            }
        }
        setBackgroundColor(0);
    }

    private final void setStateFileDownloading(int i11) {
        C11874v c11874v = this.f65085P;
        C11874v c11874v2 = null;
        if (c11874v == null) {
            AbstractC19074t.m100223u("imvThumb");
            c11874v = null;
        }
        c11874v.m65986D1(i11);
        C11874v c11874v3 = this.f65085P;
        if (c11874v3 == null) {
            AbstractC19074t.m100223u("imvThumb");
        } else {
            c11874v2 = c11874v3;
        }
        c11874v2.m65987E1(1);
    }

    /* renamed from: d0 */
    public final void m69894d0(MediaStoreItem mediaStoreItem, boolean z11) {
        AbstractC19074t.m100208f(mediaStoreItem, "mediaStoreItem");
        C11874v c11874v = this.f65085P;
        if (c11874v == null) {
            AbstractC19074t.m100223u("imvThumb");
            c11874v = null;
        }
        String m95131f5 = mediaStoreItem.m40599m().m95131f5();
        AbstractC19074t.m100207e(m95131f5, "getUrl_thumb(...)");
        if (m95131f5.length() > 0) {
            c11874v.m111929z1(5);
            c11874v.mo111926w1(AbstractC16803z.chat_icloud_default);
            boolean m125696L2 = C23999j.m125696L2(mediaStoreItem.m40599m().m95131f5(), C23278z2.m120126f0());
            c11874v.m89129Y0(mediaStoreItem.m40599m().m95131f5());
            C16718f m89106L = c11874v.m89106L();
            int i11 = this.f65084O;
            m89106L.m89042Z(i11, i11, i11, i11);
            if (m125696L2 || !z11) {
                C23528a c23528a = this.f65097e0;
                AbstractC19074t.m100205c(c23528a);
                ((C23528a) c23528a.m123612r(this.f65093a0)).m123579C(mediaStoreItem.m40599m().m95131f5(), C23278z2.m120126f0(), new C12451b(c11874v, this, m125696L2));
                return;
            }
            return;
        }
        c11874v.m111929z1(0);
        c11874v.m89106L().m89042Z(0, AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f));
        c11874v.m89085A0(null);
        if (mediaStoreItem.m40585b0()) {
            c11874v.mo111925v1(getIcnFolderDrawable());
            return;
        }
        Context context = c11874v.getContext();
        String m95223p3 = mediaStoreItem.m40599m().m95223p3();
        if (m95223p3 == null) {
            m95223p3 = "";
        } else {
            AbstractC19074t.m100205c(m95223p3);
        }
        c11874v.mo111925v1(AbstractC28236y3.m142197h(context, m95223p3));
    }

    public final C16719g getCline() {
        return this.f65096d0;
    }

    public final int getMarginLeftBottomLineStyleContent() {
        return ((Number) this.f65107o0.getValue()).intValue();
    }

    public final Rect getRectView() {
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            C16716d c16716d = this.f65094b0;
            if (c16716d == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d = null;
            }
            int m89114P = c16716d.m89114P() + i11;
            C16716d c16716d2 = this.f65094b0;
            if (c16716d2 == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d2 = null;
            }
            return new Rect(i11, i12, m89114P, c16716d2.m89112O() + i12);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: h0 */
    public final void m69895h0(final Context context) {
        C16716d c16716d;
        AbstractC19074t.m100208f(context, "context");
        mo44090O();
        this.f65097e0 = new C23528a(context);
        this.f65093a0 = new C3977j(context);
        C16716d c16716d2 = new C16716d(context);
        c16716d2.m89106L().m89060k0(-1).m89030N(-2).m89044a0(this.f65080K);
        c16716d2.m89087B0(AbstractC16803z.search_global_bg_rect_white_with_press_state);
        this.f65094b0 = c16716d2;
        final C11874v c11874v = new C11874v(context);
        c11874v.m89106L().m89030N(this.f65082M).m89060k0(this.f65081L).m89034R(this.f65083N).m89035S(this.f65083N).m89041Y(1);
        c11874v.m111929z1(5);
        c11874v.mo111926w1(AbstractC16803z.chat_icloud_default);
        c11874v.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.cLink1));
        c11874v.mo111927x1(AbstractC23136l9.m118742r(6.0f));
        c11874v.mo89109M0(new C16719g.c() { // from class: q80.b
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                MediaStoreItemFileModuleView.m69889l0(MediaStoreItemFileModuleView.this, c11874v, c16719g);
            }
        });
        this.f65085P = c11874v;
        C16716d c16716d3 = this.f65094b0;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d3 = null;
        }
        C11874v c11874v2 = this.f65085P;
        if (c11874v2 == null) {
            AbstractC19074t.m100223u("imvThumb");
            c11874v2 = null;
        }
        c16716d3.m89001g1(c11874v2);
        C21693c c21693c = new C21693c(context);
        C16718f m89030N = c21693c.m89106L().m89060k0(-2).m89030N(-2);
        C11874v c11874v3 = this.f65085P;
        if (c11874v3 == null) {
            AbstractC19074t.m100223u("imvThumb");
            c11874v3 = null;
        }
        C16718f m89071x = m89030N.m89071x(c11874v3);
        C11874v c11874v4 = this.f65085P;
        if (c11874v4 == null) {
            AbstractC19074t.m100223u("imvThumb");
            c11874v4 = null;
        }
        m89071x.m89067t(c11874v4).m89046b0(AbstractC23136l9.m118742r(2.0f)).m89044a0(AbstractC23136l9.m118742r(2.0f));
        this.f65086Q = c21693c;
        C16716d c16716d4 = this.f65094b0;
        if (c16716d4 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d4 = null;
        }
        C21693c c21693c2 = this.f65086Q;
        if (c21693c2 == null) {
            AbstractC19074t.m100223u("icnFileExt");
            c21693c2 = null;
        }
        c16716d4.m89001g1(c21693c2);
        if (this.f65101i0) {
            if (this.f65099g0 == null) {
                this.f65099g0 = AbstractC23136l9.m118665N(context, AbstractC16803z.ic_unchecked_radio_button_header);
            }
            if (this.f65100h0 == null) {
                this.f65100h0 = AbstractC23136l9.m118665N(context, AbstractC16803z.btn_radio_on_holo_light);
            }
            final C21691a c21691a = new C21691a(context);
            C16718f m89106L = c21691a.m89106L();
            Drawable drawable = this.f65099g0;
            AbstractC19074t.m100205c(drawable);
            C16718f m89060k0 = m89106L.m89060k0(drawable.getIntrinsicWidth() + (this.f65083N * 2));
            Drawable drawable2 = this.f65099g0;
            AbstractC19074t.m100205c(drawable2);
            m89060k0.m89030N(drawable2.getIntrinsicHeight() + (this.f65083N * 2)).m89041Y(this.f65083N).m89027K(true).m89017A(Boolean.TRUE);
            c21691a.m111906k1(this.f65099g0);
            c21691a.m111905j1(this.f65100h0);
            c21691a.mo89107L0(new C16719g.b() { // from class: q80.c
                @Override // com.zing.zalo.uidrawing.C16719g.b
                /* renamed from: a */
                public final void mo945a(C16719g c16719g, boolean z11) {
                    MediaStoreItemFileModuleView.m69890m0(C21691a.this, this, context, c16719g, z11);
                }
            });
            this.f65098f0 = c21691a;
            C16716d c16716d5 = this.f65094b0;
            if (c16716d5 == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d5 = null;
            }
            C21691a c21691a2 = this.f65098f0;
            AbstractC19074t.m100205c(c21691a2);
            c16716d5.m89001g1(c21691a2);
        } else {
            C21693c c21693c3 = new C21693c(context);
            c21693c3.m89106L().m89030N(-2).m89060k0(-2).m89041Y(this.f65083N).m89027K(true).m89017A(Boolean.TRUE);
            c21693c3.m111929z1(5);
            c21693c3.mo111925v1(C27280g.m139660c(context, AbstractC2810d.zds_ic_more_horizontal_solid_24, AbstractC2807a.icon_01));
            c21693c3.mo89109M0(new C16719g.c() { // from class: q80.d
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    MediaStoreItemFileModuleView.m69891n0(MediaStoreItemFileModuleView.this, c16719g);
                }
            });
            this.f65092W = c21693c3;
            C16716d c16716d6 = this.f65094b0;
            if (c16716d6 == null) {
                AbstractC19074t.m100223u("layoutContainerFile");
                c16716d6 = null;
            }
            C21693c c21693c4 = this.f65092W;
            AbstractC19074t.m100205c(c21693c4);
            c16716d6.m89001g1(c21693c4);
        }
        m69893r0();
        C16716d c16716d7 = new C16716d(context);
        C16718f m89027K = c16716d7.m89106L().m89030N(-2).m89060k0(-2).m89027K(true);
        C16719g c16719g = this.f65085P;
        if (c16719g == null) {
            AbstractC19074t.m100223u("imvThumb");
            c16719g = null;
        }
        m89027K.m89054h0(c16719g).m89049e0(this.f65092W);
        if (this.f65101i0) {
            c16716d7.m89106L().m89049e0(this.f65098f0);
        }
        C16716d c16716d8 = new C16716d(context);
        C16718f m89106L2 = c16716d8.m89106L();
        Boolean bool = Boolean.TRUE;
        C16718f m89017A = m89106L2.m89017A(bool);
        TabMsgCommonItemModuleView.C12429a c12429a = TabMsgCommonItemModuleView.Companion;
        m89017A.m89034R(c12429a.m69863c()).m89035S(c12429a.m69864d()).m89028L(-2, -2);
        C22126c0 c22126c0 = new C22126c0(context);
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        c22126c0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22126c0.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        c22126c0.m89106L().m89025I(true).m89028L(-2, -2).m89017A(bool);
        c16716d8.m89001g1(c22126c0);
        this.f65091V = c22126c0;
        c16716d7.m89001g1(c16716d8);
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m89106L().m89060k0(-1).m89030N(-2).m89050f0(new C20003a(true, c16716d8));
        c22126c02.m111953A1(1);
        c22126c02.m111980v1(truncateAt);
        c22126c02.m111962J1(C23212s8.m119607o(context, AbstractC16781w.SearchGlobalTitleItemSearch));
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(15.0f));
        this.f65087R = c22126c02;
        c16716d7.m89001g1(c22126c02);
        C22124b0 c22124b0 = new C22124b0(context);
        C16718f m89036T = c22124b0.m89106L().m89060k0(-2).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C22126c0 c22126c03 = this.f65087R;
        if (c22126c03 == null) {
            AbstractC19074t.m100223u("tvTitle");
            c22126c03 = null;
        }
        m89036T.m89023G(c22126c03);
        c22124b0.f108888M0.m111953A1(1);
        c22124b0.f108888M0.m111980v1(truncateAt);
        c22124b0.f108888M0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22124b0.f108888M0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        this.f65088S = c22124b0;
        c16716d7.m89001g1(c22124b0);
        C22126c0 c22126c04 = new C22126c0(context);
        C16718f m89036T2 = c22126c04.m89106L().m89060k0(-1).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C22124b0 c22124b02 = this.f65088S;
        if (c22124b02 == null) {
            AbstractC19074t.m100223u("tvSubtitle");
            c22124b02 = null;
        }
        m89036T2.m89023G(c22124b02);
        c22126c04.m111953A1(1);
        c22126c04.m111980v1(truncateAt);
        c22126c04.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        c22126c04.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f65089T = c22126c04;
        c16716d7.m89001g1(c22126c04);
        C22124b0 c22124b03 = new C22124b0(context);
        C16718f m89036T3 = c22124b03.m89106L().m89060k0(-1).m89030N(-2).m89036T(AbstractC23136l9.m118742r(2.0f));
        C22126c0 c22126c05 = this.f65089T;
        if (c22126c05 == null) {
            AbstractC19074t.m100223u("tvExpirationInfo");
            c22126c05 = null;
        }
        m89036T3.m89023G(c22126c05);
        c22124b03.f108888M0.m111953A1(1);
        c22124b03.f108888M0.m111959G1(context.getString(AbstractC8020f0.str_error_download_file));
        c22124b03.f108888M0.m111980v1(truncateAt);
        c22124b03.f108888M0.m111962J1(C23212s8.m119607o(context, AbstractC7354t0.NotificationColor1));
        c22124b03.f108888M0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        c22124b03.m115399p1(AbstractC23222t7.f112566j);
        this.f65090U = c22124b03;
        c16716d7.m89001g1(c22124b03);
        C16716d c16716d9 = this.f65094b0;
        C16716d c16716d10 = c16716d9;
        if (c16716d9 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d10 = null;
        }
        c16716d10.m89001g1(c16716d7);
        C16716d c16716d11 = this.f65094b0;
        if (c16716d11 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d11 = null;
        }
        c16716d11.mo89109M0(new C16719g.c() { // from class: q80.e
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g2) {
                MediaStoreItemFileModuleView.m69886i0(MediaStoreItemFileModuleView.this, c16719g2);
            }
        });
        C16716d c16716d12 = this.f65094b0;
        if (c16716d12 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d12 = null;
        }
        c16716d12.m89111N0(new C16719g.d() { // from class: q80.f
            @Override // com.zing.zalo.uidrawing.C16719g.d
            /* renamed from: f */
            public final void mo942f(C16719g c16719g2) {
                MediaStoreItemFileModuleView.m69887j0(MediaStoreItemFileModuleView.this, c16719g2);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: q80.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MediaStoreItemFileModuleView.m69888k0(MediaStoreItemFileModuleView.this, view);
            }
        });
        C16716d c16716d13 = this.f65094b0;
        if (c16716d13 == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d = null;
        } else {
            c16716d = c16716d13;
        }
        mo69681L(c16716d);
        C16719g c16719g2 = new C16719g(context);
        c16719g2.m89106L().m89030N(1).m89060k0(-1).m89034R(getMarginLeftBottomLineStyleContent()).m89072y(bool);
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f65096d0 = c16719g2;
        AbstractC19074t.m100205c(c16719g2);
        mo69681L(c16719g2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0136 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:2:0x0000, B:6:0x0005, B:8:0x0010, B:9:0x001a, B:12:0x002b, B:15:0x003a, B:17:0x0040, B:18:0x0049, B:20:0x004d, B:21:0x0053, B:23:0x0079, B:24:0x007c, B:26:0x0089, B:28:0x008f, B:31:0x0094, B:32:0x00a3, B:38:0x00b3, B:40:0x00b7, B:41:0x00bb, B:43:0x00c2, B:44:0x00c7, B:46:0x00cc, B:48:0x00da, B:50:0x00de, B:51:0x00e2, B:53:0x00eb, B:54:0x00f0, B:56:0x00f4, B:58:0x00f8, B:59:0x00fd, B:61:0x0101, B:63:0x010f, B:65:0x0113, B:66:0x0117, B:68:0x0120, B:69:0x0125, B:71:0x0129, B:73:0x012d, B:74:0x0132, B:76:0x0136, B:78:0x013a, B:79:0x013e, B:81:0x0145, B:82:0x014a, B:84:0x0098, B:85:0x014d, B:88:0x0045, B:89:0x0027), top: B:1:0x0000 }] */
    /* renamed from: o0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m69896o0(MediaStoreItem mediaStoreItem, boolean z11) {
        CharSequence m40607q;
        String m40572N;
        int m40605p;
        try {
            this.f65104l0 = mediaStoreItem;
            if (mediaStoreItem == null) {
                return;
            }
            this.f65105m0 = AbstractC31111g.m151138s(mediaStoreItem);
            C22126c0 c22126c0 = this.f65087R;
            C21693c c21693c = null;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("tvTitle");
                c22126c0 = null;
            }
            if (TextUtils.isEmpty(mediaStoreItem.m40607q())) {
                m40607q = "File";
            } else {
                m40607q = mediaStoreItem.m40607q();
            }
            c22126c0.m111959G1(m40607q);
            String m94854B4 = mediaStoreItem.m40599m().m94854B4();
            if (m94854B4 == null) {
                m94854B4 = "";
            }
            if (mediaStoreItem.m40585b0()) {
                m40572N = mediaStoreItem.m40613w();
            } else {
                m40572N = mediaStoreItem.m40572N();
            }
            C22124b0 c22124b0 = this.f65088S;
            if (c22124b0 == null) {
                AbstractC19074t.m100223u("tvSubtitle");
                c22124b0 = null;
            }
            c22124b0.mo44614b1(0);
            c22124b0.f108888M0.m111959G1(m40572N + " • " + m94854B4);
            c22124b0.m115399p1(AbstractC23222t7.f112566j);
            if (this.f65102j0) {
                m69883e0();
            }
            m69884f0();
            m69885g0();
            m69894d0(mediaStoreItem, z11);
            if (this.f65102j0) {
                EnumC31105a enumC31105a = this.f65105m0;
                if (enumC31105a != EnumC31105a.f143331r && enumC31105a != EnumC31105a.f143329p) {
                    m69892p0();
                    m40605p = mediaStoreItem.m40605p();
                    if (m40605p == -1) {
                        if (m40605p != 0) {
                            if (m40605p != 1) {
                                C21693c c21693c2 = this.f65086Q;
                                if (c21693c2 == null) {
                                    AbstractC19074t.m100223u("icnFileExt");
                                    c21693c2 = null;
                                }
                                c21693c2.mo111925v1(null);
                                C21693c c21693c3 = this.f65086Q;
                                if (c21693c3 == null) {
                                    AbstractC19074t.m100223u("icnFileExt");
                                } else {
                                    c21693c = c21693c3;
                                }
                                c21693c.mo44614b1(8);
                            } else if (!TextUtils.isEmpty(mediaStoreItem.m40599m().m95131f5())) {
                                C21693c c21693c4 = this.f65086Q;
                                if (c21693c4 == null) {
                                    AbstractC19074t.m100223u("icnFileExt");
                                    c21693c4 = null;
                                }
                                c21693c4.mo111926w1(AbstractC16803z.icn_file_filetype_pdf);
                                C21693c c21693c5 = this.f65086Q;
                                if (c21693c5 == null) {
                                    AbstractC19074t.m100223u("icnFileExt");
                                } else {
                                    c21693c = c21693c5;
                                }
                                c21693c.mo44614b1(0);
                            } else {
                                C21693c c21693c6 = this.f65086Q;
                                if (c21693c6 == null) {
                                    AbstractC19074t.m100223u("icnFileExt");
                                } else {
                                    c21693c = c21693c6;
                                }
                                c21693c.mo44614b1(8);
                            }
                        } else if (!TextUtils.isEmpty(mediaStoreItem.m40599m().m95131f5())) {
                            C21693c c21693c7 = this.f65086Q;
                            if (c21693c7 == null) {
                                AbstractC19074t.m100223u("icnFileExt");
                                c21693c7 = null;
                            }
                            c21693c7.mo111926w1(AbstractC16803z.icn_file_thumb_vid);
                            C21693c c21693c8 = this.f65086Q;
                            if (c21693c8 == null) {
                                AbstractC19074t.m100223u("icnFileExt");
                            } else {
                                c21693c = c21693c8;
                            }
                            c21693c.mo44614b1(0);
                        } else {
                            C21693c c21693c9 = this.f65086Q;
                            if (c21693c9 == null) {
                                AbstractC19074t.m100223u("icnFileExt");
                            } else {
                                c21693c = c21693c9;
                            }
                            c21693c.mo44614b1(8);
                        }
                    } else {
                        C21693c c21693c10 = this.f65086Q;
                        if (c21693c10 == null) {
                            AbstractC19074t.m100223u("icnFileExt");
                            c21693c10 = null;
                        }
                        c21693c10.mo111925v1(null);
                        C21693c c21693c11 = this.f65086Q;
                        if (c21693c11 == null) {
                            AbstractC19074t.m100223u("icnFileExt");
                        } else {
                            c21693c = c21693c11;
                        }
                        c21693c.mo44614b1(8);
                    }
                }
                setStateFileDownloading(mediaStoreItem.m40599m().m94982Q2());
                m40605p = mediaStoreItem.m40605p();
                if (m40605p == -1) {
                }
            }
            m69893r0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q0 */
    public final void m69897q0(boolean z11) {
        int i11;
        C22124b0 c22124b0 = this.f65090U;
        if (c22124b0 == null) {
            AbstractC19074t.m100223u("tvError");
            c22124b0 = null;
        }
        if (z11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        c22124b0.mo44614b1(i11);
    }

    public final void setCline(C16719g c16719g) {
        this.f65096d0 = c16719g;
    }

    public final void setConversationId(String str) {
        this.f65103k0 = str;
    }

    public final void setEnableMultiSelect(boolean z11) {
        if (this.f65101i0 != z11) {
            this.f65101i0 = z11;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            m69895h0(context);
            m69893r0();
        }
    }

    public final void setFileListener(InterfaceC12450a interfaceC12450a) {
        this.f65095c0 = interfaceC12450a;
    }

    public final void setPaddingTopLayoutLinkFile(int i11) {
        C16716d c16716d = this.f65094b0;
        if (c16716d == null) {
            AbstractC19074t.m100223u("layoutContainerFile");
            c16716d = null;
        }
        c16716d.m89106L().m89042Z(0, i11, 0, AbstractC23136l9.m118742r(12.0f));
    }

    public final void setShowMenuButton(boolean z11) {
        int i11;
        C21693c c21693c = this.f65092W;
        if (c21693c != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c21693c.mo44614b1(i11);
        }
    }

    public final void setTimeline(String str) {
        try {
            C22126c0 c22126c0 = this.f65091V;
            if (c22126c0 == null) {
                AbstractC19074t.m100223u("tvTime");
                c22126c0 = null;
            }
            if (str == null) {
                str = "";
            }
            c22126c0.m111959G1(str);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final void setVisibilityCline(boolean z11) {
        int i11;
        C16719g c16719g = this.f65096d0;
        if (c16719g != null) {
            AbstractC19074t.m100205c(c16719g);
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            c16719g.mo44614b1(i11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaStoreItemFileModuleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f65080K = AbstractC23136l9.m118742r(12.0f);
        this.f65081L = AbstractC23136l9.m118742r(48.0f);
        this.f65082M = AbstractC23136l9.m118742r(48.0f);
        this.f65083N = AbstractC23136l9.m118742r(16.0f);
        this.f65084O = AbstractC23136l9.m118712h(getContext(), 1.0f);
        this.f65102j0 = true;
        this.f65105m0 = EnumC31105a.f143330q;
        this.f65106n0 = AbstractC29233h.m145990a(new C12452c());
        m129210a = AbstractC24856m.m129210a(new C12453d());
        this.f65107o0 = m129210a;
        m69895h0(context);
    }
}
