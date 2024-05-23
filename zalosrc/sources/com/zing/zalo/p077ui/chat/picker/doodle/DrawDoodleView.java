package com.zing.zalo.p077ui.chat.picker.doodle;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.SensitiveData;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.camera.common.models.CameraInputParams;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.chat.picker.doodle.DrawDoodleView;
import com.zing.zalo.p077ui.chat.picker.doodle.NewSelectColorView;
import com.zing.zalo.p077ui.chat.transfer.DrawDoodleResult;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.slider.ZdsSlider;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import e60.C18272b;
import e60.C18273c;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.InterfaceC19066n;
import hn0.AbstractC20104d;
import me0.AbstractC23136l9;
import me0.AbstractC23211s7;
import me0.C23212s8;
import p205hc.C19965d;
import p227i3.C20218v;
import p322lf.AbstractC22470k;
import p348mi.AbstractC23306f;
import p646xi.C29669a;
import p649xl.C30146z2;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import zd0.C31792a;

/* loaded from: classes5.dex */
public final class DrawDoodleView extends BaseZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {
    public static final C11622a Companion = new C11622a(null);

    /* renamed from: M0 */
    private DrawView f60522M0;

    /* renamed from: N0 */
    private RelativeLayout f60523N0;

    /* renamed from: O0 */
    private BrushSizePreview f60524O0;

    /* renamed from: P0 */
    private ActionBarMenuItem f60525P0;

    /* renamed from: Q0 */
    private final InterfaceC24854k f60526Q0 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18272b.class), new C11631e0(new C11629d0(this)), new C11633f0());

    /* renamed from: R0 */
    private C30146z2 f60527R0;

    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$a */
    /* loaded from: classes5.dex */
    public static final class C11622a {
        private C11622a() {
        }

        public /* synthetic */ C11622a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$a0 */
    /* loaded from: classes5.dex */
    public static final class C11623a0 extends AbstractC19075u implements InterfaceC18505l {
        C11623a0() {
            super(1);
        }

        /* renamed from: a */
        public final void m64906a(CameraInputParams cameraInputParams) {
            AbstractC19074t.m100208f(cameraInputParams, "inputParams");
            AbstractC22470k.m116167s(DrawDoodleView.this.m92676n2(), 2, 0, cameraInputParams);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64906a((CameraInputParams) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$b */
    /* loaded from: classes5.dex */
    public static final class C11624b extends AbstractC19075u implements InterfaceC18505l {
        C11624b() {
            super(1);
        }

        /* renamed from: a */
        public final void m64907a(Integer num) {
            BrushSizePreview brushSizePreview = DrawDoodleView.this.f60524O0;
            if (brushSizePreview == null) {
                AbstractC19074t.m100223u("vBrushSizePreview");
                brushSizePreview = null;
            }
            AbstractC19074t.m100205c(num);
            brushSizePreview.setSelectedColor(num.intValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64907a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$b0 */
    /* loaded from: classes5.dex */
    public static final class C11625b0 implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f60530p;

        C11625b0(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f60530p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f60530p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f60530p.mo205i9(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$c */
    /* loaded from: classes5.dex */
    public static final class C11626c extends AbstractC19075u implements InterfaceC18505l {
        C11626c() {
            super(1);
        }

        /* renamed from: a */
        public final void m64908a(Boolean bool) {
            int i11;
            RelativeLayout relativeLayout = DrawDoodleView.this.f60523N0;
            if (relativeLayout == null) {
                AbstractC19074t.m100223u("tablebrushsize");
                relativeLayout = null;
            }
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            relativeLayout.setVisibility(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64908a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$c0 */
    /* loaded from: classes5.dex */
    public static final class C11627c0 implements ZdsSlider.InterfaceC17047c {
        C11627c0() {
        }

        @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
        /* renamed from: a */
        public void mo45797a() {
            DrawView drawView = DrawDoodleView.this.f60522M0;
            BrushSizePreview brushSizePreview = null;
            if (drawView == null) {
                AbstractC19074t.m100223u("drawView");
                drawView = null;
            }
            BrushSizePreview brushSizePreview2 = DrawDoodleView.this.f60524O0;
            if (brushSizePreview2 == null) {
                AbstractC19074t.m100223u("vBrushSizePreview");
                brushSizePreview2 = null;
            }
            drawView.setBrushSize(brushSizePreview2.getCurrentBrushSize());
            NewSelectColorView newSelectColorView = DrawDoodleView.this.m64891lM().f140091z;
            BrushSizePreview brushSizePreview3 = DrawDoodleView.this.f60524O0;
            if (brushSizePreview3 == null) {
                AbstractC19074t.m100223u("vBrushSizePreview");
            } else {
                brushSizePreview = brushSizePreview3;
            }
            newSelectColorView.setCurrentSize(brushSizePreview.getCurrentBrushSize());
        }

        @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
        /* renamed from: b */
        public void mo45798b(float f11) {
            int m104529e;
            BrushSizePreview brushSizePreview = DrawDoodleView.this.f60524O0;
            BrushSizePreview brushSizePreview2 = null;
            if (brushSizePreview == null) {
                AbstractC19074t.m100223u("vBrushSizePreview");
                brushSizePreview = null;
            }
            m104529e = AbstractC20104d.m104529e(f11);
            BrushSizePreview brushSizePreview3 = DrawDoodleView.this.f60524O0;
            if (brushSizePreview3 == null) {
                AbstractC19074t.m100223u("vBrushSizePreview");
            } else {
                brushSizePreview2 = brushSizePreview3;
            }
            brushSizePreview.setCurrentSize(m104529e + brushSizePreview2.f60513r);
        }

        @Override // com.zing.zalo.zdesign.component.slider.ZdsSlider.InterfaceC17047c
        /* renamed from: c */
        public void mo45799c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$d */
    /* loaded from: classes5.dex */
    public static final class C11628d extends AbstractC19075u implements InterfaceC18505l {
        C11628d() {
            super(1);
        }

        /* renamed from: a */
        public final void m64909a(Boolean bool) {
            ActionBarMenuItem actionBarMenuItem = DrawDoodleView.this.f60525P0;
            if (actionBarMenuItem == null) {
                AbstractC19074t.m100223u("doneMenuItem");
                actionBarMenuItem = null;
            }
            AbstractC19074t.m100205c(bool);
            actionBarMenuItem.setEnabled(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64909a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$d0 */
    /* loaded from: classes5.dex */
    public static final class C11629d0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f60534q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11629d0(ZaloView zaloView) {
            super(0);
            this.f60534q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f60534q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$e */
    /* loaded from: classes5.dex */
    public static final class C11630e extends AbstractC19075u implements InterfaceC18505l {
        C11630e() {
            super(1);
        }

        /* renamed from: a */
        public final void m64911a(Boolean bool) {
            ImageButton imageButton = DrawDoodleView.this.m64891lM().f140083r;
            AbstractC19074t.m100205c(bool);
            imageButton.setEnabled(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64911a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$e0 */
    /* loaded from: classes5.dex */
    public static final class C11631e0 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f60536q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11631e0(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f60536q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f60536q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$f */
    /* loaded from: classes5.dex */
    public static final class C11632f extends AbstractC19075u implements InterfaceC18505l {
        C11632f() {
            super(1);
        }

        /* renamed from: a */
        public final void m64913a(Boolean bool) {
            ImageButton imageButton = DrawDoodleView.this.m64891lM().f140087v;
            AbstractC19074t.m100205c(bool);
            imageButton.setEnabled(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64913a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$f0 */
    /* loaded from: classes5.dex */
    static final class C11633f0 extends AbstractC19075u implements InterfaceC18494a {
        C11633f0() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return DrawDoodleView.this.m64893nM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$g */
    /* loaded from: classes5.dex */
    public static final class C11634g extends AbstractC19075u implements InterfaceC18505l {
        C11634g() {
            super(1);
        }

        /* renamed from: a */
        public final void m64915a(Boolean bool) {
            ImageButton imageButton = DrawDoodleView.this.m64891lM().f140083r;
            AbstractC19074t.m100205c(bool);
            imageButton.setClickable(bool.booleanValue());
            DrawDoodleView.this.m64891lM().f140087v.setClickable(bool.booleanValue());
            DrawDoodleView.this.m64891lM().f140085t.setClickable(bool.booleanValue());
            DrawDoodleView.this.m64891lM().f140084s.setClickable(bool.booleanValue());
            DrawDoodleView.this.m64891lM().f140086u.setClickable(bool.booleanValue());
            DrawDoodleView.this.m64891lM().f140082q.setClickable(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64915a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$h */
    /* loaded from: classes5.dex */
    public static final class C11635h extends AbstractC19075u implements InterfaceC18505l {
        C11635h() {
            super(1);
        }

        /* renamed from: a */
        public final void m64916a(Boolean bool) {
            ImageButton imageButton = DrawDoodleView.this.m64891lM().f140085t;
            AbstractC19074t.m100205c(bool);
            imageButton.setSelected(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64916a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$i */
    /* loaded from: classes5.dex */
    public static final class C11636i extends AbstractC19075u implements InterfaceC18505l {
        C11636i() {
            super(1);
        }

        /* renamed from: a */
        public final void m64917a(Boolean bool) {
            ImageButton imageButton = DrawDoodleView.this.m64891lM().f140084s;
            AbstractC19074t.m100205c(bool);
            imageButton.setSelected(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64917a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$j */
    /* loaded from: classes5.dex */
    public static final class C11637j extends AbstractC19075u implements InterfaceC18505l {
        C11637j() {
            super(1);
        }

        /* renamed from: a */
        public final void m64918a(Boolean bool) {
            ImageButton imageButton = DrawDoodleView.this.m64891lM().f140086u;
            AbstractC19074t.m100205c(bool);
            imageButton.setSelected(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64918a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$k */
    /* loaded from: classes5.dex */
    public static final class C11638k extends AbstractC19075u implements InterfaceC18505l {
        C11638k() {
            super(1);
        }

        /* renamed from: a */
        public final void m64919a(int[] iArr) {
            DrawDoodleView.this.m64891lM().f140091z.setColorList(iArr);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64919a((int[]) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$l */
    /* loaded from: classes5.dex */
    public static final class C11639l extends AbstractC19075u implements InterfaceC18505l {
        C11639l() {
            super(1);
        }

        /* renamed from: a */
        public final void m64920a(Boolean bool) {
            int i11;
            NewSelectColorView newSelectColorView = DrawDoodleView.this.m64891lM().f140091z;
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            newSelectColorView.setVisibility(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64920a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$m */
    /* loaded from: classes5.dex */
    public static final class C11640m extends AbstractC19075u implements InterfaceC18505l {
        C11640m() {
            super(1);
        }

        /* renamed from: a */
        public final void m64921a(Integer num) {
            C18272b m64892mM = DrawDoodleView.this.m64892mM();
            AbstractC19074t.m100205c(num);
            int intValue = num.intValue();
            DrawView drawView = DrawDoodleView.this.f60522M0;
            if (drawView == null) {
                AbstractC19074t.m100223u("drawView");
                drawView = null;
            }
            m64892mM.m97068E0(intValue, drawView.getMode());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64921a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$n */
    /* loaded from: classes5.dex */
    public static final class C11641n extends AbstractC19075u implements InterfaceC18505l {
        C11641n() {
            super(1);
        }

        /* renamed from: a */
        public final void m64922a(Boolean bool) {
            C18272b m64892mM = DrawDoodleView.this.m64892mM();
            AbstractC19074t.m100205c(bool);
            m64892mM.m97076N0(bool.booleanValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64922a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$o */
    /* loaded from: classes5.dex */
    public static final class C11642o extends AbstractC19075u implements InterfaceC18505l {
        C11642o() {
            super(1);
        }

        /* renamed from: a */
        public final void m64923a(String str) {
            DrawView drawView = DrawDoodleView.this.f60522M0;
            if (drawView == null) {
                AbstractC19074t.m100223u("drawView");
                drawView = null;
            }
            drawView.m64947j(str, DrawDoodleView.this.m92651WI().getDisplayMetrics().widthPixels);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64923a((String) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$p */
    /* loaded from: classes5.dex */
    public static final class C11643p extends AbstractC19075u implements InterfaceC18505l {
        C11643p() {
            super(1);
        }

        /* renamed from: a */
        public final void m64924a(Integer num) {
            DrawView drawView = DrawDoodleView.this.f60522M0;
            if (drawView == null) {
                AbstractC19074t.m100223u("drawView");
                drawView = null;
            }
            AbstractC19074t.m100205c(num);
            drawView.setMode(num.intValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64924a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$q */
    /* loaded from: classes5.dex */
    public static final class C11644q extends AbstractC19075u implements InterfaceC18505l {
        C11644q() {
            super(1);
        }

        /* renamed from: a */
        public final void m64925a(Integer num) {
            DrawView drawView = DrawDoodleView.this.f60522M0;
            if (drawView == null) {
                AbstractC19074t.m100223u("drawView");
                drawView = null;
            }
            AbstractC19074t.m100205c(num);
            drawView.setBrushColor(num.intValue());
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64925a((Integer) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$r */
    /* loaded from: classes5.dex */
    public static final class C11645r extends AbstractC19075u implements InterfaceC18505l {
        C11645r() {
            super(1);
        }

        /* renamed from: a */
        public final void m64926a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            DrawView drawView = DrawDoodleView.this.f60522M0;
            if (drawView == null) {
                AbstractC19074t.m100223u("drawView");
                drawView = null;
            }
            drawView.m64943c();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64926a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$s */
    /* loaded from: classes5.dex */
    public static final class C11646s extends AbstractC19075u implements InterfaceC18505l {
        C11646s() {
            super(1);
        }

        /* renamed from: a */
        public final void m64927a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            DrawView drawView = DrawDoodleView.this.f60522M0;
            if (drawView == null) {
                AbstractC19074t.m100223u("drawView");
                drawView = null;
            }
            drawView.m64948n();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64927a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$t */
    /* loaded from: classes5.dex */
    public static final class C11647t extends AbstractC19075u implements InterfaceC18505l {
        C11647t() {
            super(1);
        }

        /* renamed from: a */
        public final void m64928a(DrawDoodleResult drawDoodleResult) {
            AbstractC19074t.m100208f(drawDoodleResult, "result");
            Intent intent = new Intent();
            intent.putExtra("EXTRA_DOODLE_RESULT", drawDoodleResult);
            DrawDoodleView.this.mo50035CK(-1, intent);
            DrawDoodleView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64928a((DrawDoodleResult) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$u */
    /* loaded from: classes5.dex */
    public static final class C11648u extends AbstractC19075u implements InterfaceC18505l {
        C11648u() {
            super(1);
        }

        /* renamed from: a */
        public final void m64929a(C24848g0 c24848g0) {
            AbstractC19074t.m100208f(c24848g0, "it");
            DrawDoodleView.this.mo50035CK(0, null);
            DrawDoodleView.this.finish();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64929a((C24848g0) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$v */
    /* loaded from: classes5.dex */
    public static final class C11649v extends AbstractC19075u implements InterfaceC18505l {
        C11649v() {
            super(1);
        }

        /* renamed from: a */
        public final void m64930a(Boolean bool) {
            AbstractC19074t.m100205c(bool);
            if (bool.booleanValue()) {
                DrawDoodleView.this.mo46829Y();
            } else {
                DrawDoodleView.this.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64930a((Boolean) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$w */
    /* loaded from: classes5.dex */
    public static final class C11650w extends AbstractC19075u implements InterfaceC18505l {
        C11650w() {
            super(1);
        }

        /* renamed from: a */
        public final void m64931a(int i11) {
            DrawDoodleView.this.showDialog(i11);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64931a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$x */
    /* loaded from: classes5.dex */
    public static final class C11651x extends AbstractC19075u implements InterfaceC18505l {
        C11651x() {
            super(1);
        }

        /* renamed from: a */
        public final void m64932a(int i11) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_SENSITIVE_DATA", new SensitiveData("gallery_in_doodle", "comm_csc", null, 4, null));
            AbstractC23211s7.m119589v(DrawDoodleView.this.m92676n2(), 6, i11, true, bundle);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64932a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$y */
    /* loaded from: classes5.dex */
    public static final class C11652y extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C11652y f60557q = new C11652y();

        C11652y() {
            super(1);
        }

        /* renamed from: a */
        public final void m64933a(int i11) {
            ToastUtils.m89266n(i11, new Object[0]);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64933a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.DrawDoodleView$z */
    /* loaded from: classes5.dex */
    public static final class C11653z extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final C11653z f60558q = new C11653z();

        C11653z() {
            super(1);
        }

        /* renamed from: a */
        public final void m64934a(int i11) {
            ToastUtils.showMess(AbstractC23136l9.m118746s0(AbstractC8020f0.error_general_error_code, Integer.valueOf(i11)));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m64934a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* renamed from: AM */
    private final void m64877AM() {
        m64892mM().m97095o0().m9219j(this, new C19965d(new C11651x()));
    }

    /* renamed from: BM */
    private final void m64878BM() {
        m64892mM().m97096p0().m9219j(this, new C19965d(C11652y.f60557q));
        m64892mM().m97097q0().m9219j(this, new C19965d(C11653z.f60558q));
    }

    /* renamed from: CM */
    private final void m64879CM() {
        m64892mM().m97098r0().m9219j(this, new C19965d(new C11623a0()));
    }

    /* renamed from: DM */
    private final void m64880DM() {
        m64891lM().f140082q.setOnClickListener(this);
        m64891lM().f140083r.setOnClickListener(this);
        m64891lM().f140084s.setOnClickListener(this);
        m64891lM().f140086u.setOnClickListener(this);
        m64891lM().f140085t.setOnClickListener(this);
        m64891lM().f140087v.setOnClickListener(this);
        m64891lM().f140091z.setOnColorChangedListener(new NewSelectColorView.InterfaceC11656a() { // from class: e60.a
            @Override // com.zing.zalo.p077ui.chat.picker.doodle.NewSelectColorView.InterfaceC11656a
            /* renamed from: a */
            public final void mo64960a(int i11) {
                DrawDoodleView.m64881EM(DrawDoodleView.this, i11);
            }
        });
        m64900uM();
        m64878BM();
        m64905zM();
        m64904yM();
        m64902wM();
        m64903xM();
        m64877AM();
        m64879CM();
        m64901vM();
        m64897rM();
        m64894oM();
        m64899tM();
        m64895pM();
        m64896qM();
        m64898sM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m64881EM(DrawDoodleView drawDoodleView, int i11) {
        AbstractC19074t.m100208f(drawDoodleView, "this$0");
        drawDoodleView.m64892mM().m97065B0(i11);
    }

    /* renamed from: FM */
    private final void m64882FM() {
        Resources m92651WI = m92651WI();
        AbstractC19074t.m100207e(m92651WI, "getResources(...)");
        DrawView drawView = new DrawView(getContext(), 6 * m92651WI.getDisplayMetrics().density);
        this.f60522M0 = drawView;
        drawView.m64947j("", m92651WI.getDisplayMetrics().widthPixels);
        DrawView drawView2 = this.f60522M0;
        BrushSizePreview brushSizePreview = null;
        if (drawView2 == null) {
            AbstractC19074t.m100223u("drawView");
            drawView2 = null;
        }
        drawView2.setMode(0);
        FrameLayout frameLayout = m64891lM().f140089x;
        DrawView drawView3 = this.f60522M0;
        if (drawView3 == null) {
            AbstractC19074t.m100223u("drawView");
            drawView3 = null;
        }
        frameLayout.addView(drawView3);
        View m92691vK = m92691vK();
        AbstractC19074t.m100207e(m92691vK, "requireView(...)");
        View inflate = ((ViewStub) m92691vK.findViewById(AbstractC6918a0.stub_layout_brush_size)).inflate();
        AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        RelativeLayout relativeLayout = (RelativeLayout) inflate;
        this.f60523N0 = relativeLayout;
        if (relativeLayout == null) {
            AbstractC19074t.m100223u("tablebrushsize");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(8);
        View findViewById = m92691vK.findViewById(AbstractC6918a0.brush_max_size);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f60524O0 = (BrushSizePreview) findViewById;
        ZdsSlider zdsSlider = (ZdsSlider) m92691vK.findViewById(AbstractC6918a0.seekbar_brush_size);
        BrushSizePreview brushSizePreview2 = this.f60524O0;
        if (brushSizePreview2 == null) {
            AbstractC19074t.m100223u("vBrushSizePreview");
            brushSizePreview2 = null;
        }
        int i11 = brushSizePreview2.f60512q;
        BrushSizePreview brushSizePreview3 = this.f60524O0;
        if (brushSizePreview3 == null) {
            AbstractC19074t.m100223u("vBrushSizePreview");
            brushSizePreview3 = null;
        }
        zdsSlider.m91245l(0.0f, i11 - brushSizePreview3.f60513r);
        zdsSlider.setStepSize(1.0f);
        zdsSlider.setListener(new C11627c0());
        m64891lM().f140088w.requestDisallowInterceptTouchEvent(true);
        DrawView drawView4 = this.f60522M0;
        if (drawView4 == null) {
            AbstractC19074t.m100223u("drawView");
            drawView4 = null;
        }
        BrushSizePreview brushSizePreview4 = this.f60524O0;
        if (brushSizePreview4 == null) {
            AbstractC19074t.m100223u("vBrushSizePreview");
            brushSizePreview4 = null;
        }
        drawView4.setBrushSize(brushSizePreview4.getCurrentBrushSize());
        NewSelectColorView newSelectColorView = m64891lM().f140091z;
        BrushSizePreview brushSizePreview5 = this.f60524O0;
        if (brushSizePreview5 == null) {
            AbstractC19074t.m100223u("vBrushSizePreview");
        } else {
            brushSizePreview = brushSizePreview5;
        }
        newSelectColorView.setCurrentSize(brushSizePreview.getCurrentBrushSize());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public final C30146z2 m64891lM() {
        C30146z2 c30146z2 = this.f60527R0;
        AbstractC19074t.m100205c(c30146z2);
        return c30146z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public final C18272b m64892mM() {
        return (C18272b) this.f60526Q0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public final C18273c m64893nM() {
        C29669a m120715u = AbstractC23306f.m120715u();
        AbstractC19074t.m100207e(m120715u, "provideCameraRepository(...)");
        C0815e1 m2075D = C0815e1.m2075D();
        C31792a m120678j1 = AbstractC23306f.m120678j1();
        AbstractC19074t.m100207e(m120678j1, "provideSaveDoodleToFileUseCase(...)");
        AbstractC19074t.m100205c(m2075D);
        return new C18273c(m120715u, m2075D, m120678j1, this, null, 16, null);
    }

    /* renamed from: oM */
    private final void m64894oM() {
        m64892mM().m97078W().m9219j(this, new C11625b0(new C11624b()));
    }

    /* renamed from: pM */
    private final void m64895pM() {
        m64892mM().m97079X().m9219j(this, new C11625b0(new C11626c()));
    }

    /* renamed from: qM */
    private final void m64896qM() {
        m64892mM().m97087g0().m9219j(this, new C11625b0(new C11628d()));
        m64892mM().m97083b0().m9219j(this, new C11625b0(new C11630e()));
        m64892mM().m97099s0().m9219j(this, new C11625b0(new C11632f()));
        m64892mM().m97093m0().m9219j(this, new C11625b0(new C11634g()));
    }

    /* renamed from: rM */
    private final void m64897rM() {
        m64892mM().m97081Z().m9219j(this, new C11625b0(new C11635h()));
        m64892mM().m97080Y().m9219j(this, new C11625b0(new C11636i()));
        m64892mM().m97082a0().m9219j(this, new C11625b0(new C11637j()));
    }

    /* renamed from: sM */
    private final void m64898sM() {
        m64892mM().m97085e0().m9219j(this, new C11625b0(new C11638k()));
    }

    /* renamed from: tM */
    private final void m64899tM() {
        m64892mM().m97086f0().m9219j(this, new C11625b0(new C11639l()));
    }

    /* renamed from: uM */
    private final void m64900uM() {
        DrawView drawView = this.f60522M0;
        DrawView drawView2 = null;
        if (drawView == null) {
            AbstractC19074t.m100223u("drawView");
            drawView = null;
        }
        drawView.getDrawObjectsCount().m9219j(this, new C11625b0(new C11640m()));
        DrawView drawView3 = this.f60522M0;
        if (drawView3 == null) {
            AbstractC19074t.m100223u("drawView");
        } else {
            drawView2 = drawView3;
        }
        drawView2.getTouchDrawing().m9219j(this, new C11625b0(new C11641n()));
    }

    /* renamed from: vM */
    private final void m64901vM() {
        m64892mM().m97088h0().m9219j(this, new C11625b0(new C11642o()));
        m64892mM().m97090j0().m9219j(this, new C11625b0(new C11643p()));
        m64892mM().m97089i0().m9219j(this, new C11625b0(new C11644q()));
        m64892mM().m97084c0().m9219j(this, new C19965d(new C11645r()));
        m64892mM().m97100t0().m9219j(this, new C19965d(new C11646s()));
    }

    /* renamed from: wM */
    private final void m64902wM() {
        m64892mM().m97091k0().m9219j(this, new C19965d(new C11647t()));
    }

    /* renamed from: xM */
    private final void m64903xM() {
        m64892mM().m97092l0().m9219j(this, new C19965d(new C11648u()));
    }

    /* renamed from: yM */
    private final void m64904yM() {
        m64892mM().m97101v0().m9219j(this, new C11625b0(new C11649v()));
    }

    /* renamed from: zM */
    private final void m64905zM() {
        m64892mM().m97094n0().m9219j(this, new C19965d(new C11650w()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        C8009j m43152a;
        if (i11 != 0) {
            if (i11 != 1) {
                m43152a = null;
            } else {
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_clear_drawing)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_delete), this);
                m43152a = aVar.m43152a();
            }
        } else {
            C8009j.a aVar2 = new C8009j.a(m92648SI());
            aVar2.m43159h(1).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_ask_to_delete_drawing)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_stay), new InterfaceC17463d.b()).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_leave), this);
            m43152a = aVar2.m43152a();
        }
        AbstractC19074t.m100205c(m43152a);
        return m43152a;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        AbstractC19074t.m100208f(actionBarMenu, "menu");
        super.mo37482FJ(actionBarMenu);
        actionBarMenu.m92750r();
        ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.menu_done, AbstractC16803z.action_menu_blue_send_icon_selector);
        AbstractC19074t.m100207e(m92738e, "addItem(...)");
        this.f60525P0 = m92738e;
        if (m92738e == null) {
            AbstractC19074t.m100223u("doneMenuItem");
            m92738e = null;
        }
        m92738e.setEnabled(false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m92637BK(true);
        this.f60527R0 = C30146z2.m148766c(layoutInflater, viewGroup, false);
        LinearLayout root = m64891lM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        this.f60527R0 = null;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(interfaceC17463d, "dialog");
        if (i11 == -1) {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 0) {
                if (mo92862f == 1) {
                    interfaceC17463d.dismiss();
                    m64892mM().m97104y0();
                    return;
                }
                return;
            }
            interfaceC17463d.dismiss();
            m64892mM().m97070G0();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            m64892mM().m97071I0();
            return true;
        }
        if (i11 == AbstractC6918a0.menu_done) {
            C18272b m64892mM = m64892mM();
            DrawView drawView = this.f60522M0;
            DrawView drawView2 = null;
            if (drawView == null) {
                AbstractC19074t.m100223u("drawView");
                drawView = null;
            }
            boolean m64944d = drawView.m64944d();
            DrawView drawView3 = this.f60522M0;
            if (drawView3 == null) {
                AbstractC19074t.m100223u("drawView");
                drawView3 = null;
            }
            Bitmap doodleBitmap = drawView3.getDoodleBitmap();
            DrawView drawView4 = this.f60522M0;
            if (drawView4 == null) {
                AbstractC19074t.m100223u("drawView");
                drawView4 = null;
            }
            boolean m64945e = drawView4.m64945e();
            DrawView drawView5 = this.f60522M0;
            if (drawView5 == null) {
                AbstractC19074t.m100223u("drawView");
            } else {
                drawView2 = drawView5;
            }
            m64892mM.m97066C0(m64944d, doodleBitmap, m64945e, drawView2.m64946f());
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackgroundResource(AbstractC16803z.bg_postfeed_actionbar);
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back);
            actionBar.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_drawview_title));
            actionBar.setTitleColor(C23212s8.m119607o(actionBar.getContext(), AbstractC16781w.HeaderFormTitleColor));
            actionBar.setSubtitle(null);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m64882FM();
        m64880DM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DrawDoodleView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        String str = null;
        Uri uri = null;
        if (i11 != 2) {
            boolean z11 = false;
            if (i11 != 4) {
                if (i11 == 6) {
                    C18272b m64892mM = m64892mM();
                    if (i12 == -1) {
                        z11 = true;
                    }
                    m64892mM.m97073K0(z11, intent);
                    return;
                }
                return;
            }
            C18272b m64892mM2 = m64892mM();
            if (i12 == -1) {
                z11 = true;
            }
            if (intent != null) {
                uri = intent.getData();
            }
            m64892mM2.m97074L0(z11, uri);
            return;
        }
        if (i12 == -1) {
            if (intent != null) {
                str = intent.getStringExtra("extra_result_output_path");
            }
            C18272b m64892mM3 = m64892mM();
            if (str == null) {
                str = "";
            }
            m64892mM3.m97072J0(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_bg) {
            m64892mM().m97103x0();
            return;
        }
        BrushSizePreview brushSizePreview = null;
        DrawView drawView = null;
        if (id2 == AbstractC6918a0.btn_cleardrawing) {
            C18272b m64892mM = m64892mM();
            DrawView drawView2 = this.f60522M0;
            if (drawView2 == null) {
                AbstractC19074t.m100223u("drawView");
            } else {
                drawView = drawView2;
            }
            m64892mM.m97105z0(drawView.m64944d());
            return;
        }
        if (id2 == AbstractC6918a0.btn_color) {
            m64892mM().m97064A0();
            return;
        }
        if (id2 == AbstractC6918a0.btn_eraser) {
            C18272b m64892mM2 = m64892mM();
            DrawView drawView3 = this.f60522M0;
            if (drawView3 == null) {
                AbstractC19074t.m100223u("drawView");
                drawView3 = null;
            }
            boolean m64944d = drawView3.m64944d();
            BrushSizePreview brushSizePreview2 = this.f60524O0;
            if (brushSizePreview2 == null) {
                AbstractC19074t.m100223u("vBrushSizePreview");
            } else {
                brushSizePreview = brushSizePreview2;
            }
            m64892mM2.m97069F0(m64944d, brushSizePreview.f60515t);
            return;
        }
        if (id2 == AbstractC6918a0.btn_draw) {
            m64892mM().m97067D0();
        } else if (id2 == AbstractC6918a0.btn_undo) {
            m64892mM().m97077O0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            m64892mM().m97102w0();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m64892mM().m97075M0(C11657a.Companion.m64964a(m92642L3()));
    }
}
