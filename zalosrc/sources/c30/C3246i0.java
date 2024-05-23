package c30;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import c30.C3246i0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.p077ui.StickerView;
import com.zing.zalo.uicontrol.AnimImageView;
import com.zing.zalo.uicontrol.PushToTalkControl;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import me0.AbstractC23041d2;
import p207he.C20024r;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p471r3.C25630b;
import p716zh.C31967j;
import vg.AbstractC28054e7;
import vg.C28020b3;
import vg.C28181s2;

/* renamed from: c30.i0 */
/* loaded from: classes5.dex */
public class C3246i0 extends KeyEventCallbackC17462c {

    /* renamed from: c30.i0$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a */
        private final Context f13876a;

        /* renamed from: b */
        private String f13877b;

        /* renamed from: c */
        private String f13878c;

        /* renamed from: d */
        private String f13879d;

        /* renamed from: e */
        private AnimImageView f13880e;

        /* renamed from: f */
        private StickerView f13881f;

        /* renamed from: g */
        private ProgressBar f13882g;

        /* renamed from: h */
        private C25630b f13883h;

        /* renamed from: i */
        private final C23528a f13884i;

        /* renamed from: j */
        InterfaceC17463d.d f13885j;

        /* renamed from: k */
        InterfaceC17463d.d f13886k;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c30.i0$a$a, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C32690a extends AbstractC28054e7 {
            C32690a() {
            }

            @Override // vg.AbstractC28054e7
            /* renamed from: a */
            public void mo16496a(int i11) {
                try {
                    if (a.this.f13880e != null) {
                        a.this.f13880e.m87663g(AbstractC16803z.anim_stickervoice_right_4);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // vg.AbstractC28054e7
            /* renamed from: c */
            public void mo16497c() {
                try {
                    if (a.this.f13880e != null) {
                        a.this.f13880e.m87662f();
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }

            @Override // vg.AbstractC28054e7
            /* renamed from: e */
            public void mo16498e() {
                try {
                    if (a.this.f13880e != null) {
                        a.this.f13880e.m87663g(AbstractC16803z.anim_stickervoice_right_4);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        public a(Context context) {
            this.f13876a = context;
            this.f13884i = new C23528a(context);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m16476m(View view) {
            m16490u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m16477n(View view) {
            m16490u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ void m16478o(C3246i0 c3246i0, View view) {
            m16482A();
            this.f13885j.mo605K8(c3246i0, -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public /* synthetic */ void m16479p(C3246i0 c3246i0, View view) {
            m16482A();
            this.f13886k.mo605K8(c3246i0, -2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m16480q(C3246i0 c3246i0, View view) {
            InterfaceC17463d.d dVar = this.f13885j;
            if (dVar != null) {
                dVar.mo605K8(c3246i0, -1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: r */
        public /* synthetic */ void m16481r() {
            try {
                C25630b c25630b = this.f13883h;
                if (c25630b != null) {
                    if (c25630b.m132399G()) {
                        if (!AbstractC23041d2.m118194A(this.f13883h.m132435m())) {
                            C28020b3.f130648a.m141202r(this.f13883h);
                            AnimImageView animImageView = this.f13880e;
                            if (animImageView != null) {
                                animImageView.setVisibility(8);
                            }
                        } else {
                            AnimImageView animImageView2 = this.f13880e;
                            if (animImageView2 != null) {
                                animImageView2.setVisibility(0);
                            }
                        }
                    } else {
                        AnimImageView animImageView3 = this.f13880e;
                        if (animImageView3 != null) {
                            animImageView3.setVisibility(0);
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: A */
        public void m16482A() {
            try {
                C25630b c25630b = this.f13883h;
                if (c25630b != null && c25630b.m132399G()) {
                    C31967j.m153687a().m153695i();
                    AnimImageView animImageView = this.f13880e;
                    if (animImageView != null) {
                        animImageView.m87663g(AbstractC16803z.anim_stickervoice_right_4);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: h */
        public void m16483h() {
            m16482A();
            C25630b c25630b = this.f13883h;
            if (c25630b != null && this.f13881f != null) {
                C28181s2.f131306a.m141725h(c25630b);
            }
            this.f13883h = null;
        }

        /* renamed from: i */
        public C3246i0 m16484i() {
            C3246i0 m16486k;
            C25630b c25630b = this.f13883h;
            if (c25630b == null) {
                return null;
            }
            try {
                if (c25630b.m132399G()) {
                    m16486k = m16485j();
                } else {
                    m16486k = m16486k();
                }
                m16488s();
                return m16486k;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }

        /* renamed from: j */
        C3246i0 m16485j() {
            LayoutInflater layoutInflater = (LayoutInflater) this.f13876a.getSystemService("layout_inflater");
            final C3246i0 c3246i0 = new C3246i0(this.f13876a, AbstractC8915g0.Theme_Dialog_Translucent);
            c3246i0.m92870v(1);
            View inflate = layoutInflater.inflate(AbstractC7409c0.stickervoice_preview_dialog, (ViewGroup) null);
            c3246i0.m92859c(inflate, new ViewGroup.LayoutParams(-1, -2));
            StickerView stickerView = (StickerView) inflate.findViewById(AbstractC6918a0.sticker_preview_animation);
            this.f13881f = stickerView;
            stickerView.setOnClickListener(new View.OnClickListener() { // from class: c30.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3246i0.a.this.m16476m(view);
                }
            });
            this.f13882g = (ProgressBar) inflate.findViewById(AbstractC6918a0.pbLoading);
            AnimImageView animImageView = (AnimImageView) inflate.findViewById(AbstractC6918a0.sticker_preview_voice);
            this.f13880e = animImageView;
            animImageView.setImageResource(AbstractC16803z.anim_stickervoice_right_4);
            this.f13880e.setSleepTime(120L);
            this.f13880e.setAnimArray(new int[]{AbstractC16803z.anim_stickervoice_right_1, AbstractC16803z.anim_stickervoice_right_2, AbstractC16803z.anim_stickervoice_right_3, AbstractC16803z.anim_stickervoice_right_4});
            this.f13880e.setOnClickListener(new View.OnClickListener() { // from class: c30.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3246i0.a.this.m16477n(view);
                }
            });
            ((TextView) inflate.findViewById(AbstractC6918a0.confirm_title)).setText(this.f13877b);
            if (this.f13878c != null) {
                ((Button) inflate.findViewById(AbstractC6918a0.confirm_btn_yes)).setText(this.f13878c);
                if (this.f13885j != null) {
                    inflate.findViewById(AbstractC6918a0.confirm_btn_yes).setOnClickListener(new View.OnClickListener() { // from class: c30.g0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3246i0.a.this.m16478o(c3246i0, view);
                        }
                    });
                }
            } else {
                inflate.findViewById(AbstractC6918a0.confirm_btn_yes).setVisibility(8);
            }
            if (this.f13879d != null) {
                ((Button) inflate.findViewById(AbstractC6918a0.confirm_btn_no)).setText(this.f13879d);
                if (this.f13886k != null) {
                    inflate.findViewById(AbstractC6918a0.confirm_btn_no).setOnClickListener(new View.OnClickListener() { // from class: c30.h0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C3246i0.a.this.m16479p(c3246i0, view);
                        }
                    });
                }
            } else {
                inflate.findViewById(AbstractC6918a0.confirm_btn_no).setVisibility(8);
            }
            c3246i0.m92851B(inflate);
            return c3246i0;
        }

        /* renamed from: k */
        C3246i0 m16486k() {
            LayoutInflater from = LayoutInflater.from(this.f13876a);
            final C3246i0 c3246i0 = new C3246i0(this.f13876a, AbstractC8915g0.ContentPickerPopup);
            View inflate = from.inflate(AbstractC7409c0.chat_sticker_preview, (ViewGroup) null);
            inflate.setVisibility(0);
            c3246i0.m92859c(inflate, new ViewGroup.LayoutParams(-1, -2));
            StickerView stickerView = (StickerView) inflate.findViewById(AbstractC6918a0.gifPreviewSticker);
            this.f13881f = stickerView;
            stickerView.setOnClickListener(new View.OnClickListener() { // from class: c30.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3246i0.a.this.m16480q(c3246i0, view);
                }
            });
            this.f13882g = (ProgressBar) inflate.findViewById(AbstractC6918a0.pbLoading);
            View findViewById = inflate.findViewById(AbstractC6918a0.sticker_preview_touch_to_send);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            c3246i0.m92851B(inflate);
            return c3246i0;
        }

        /* renamed from: l */
        public C25630b m16487l() {
            return this.f13883h;
        }

        /* renamed from: s */
        public void m16488s() {
            String str = System.currentTimeMillis() + "";
            C25630b c25630b = this.f13883h;
            if (c25630b != null) {
                if (c25630b.m132448z()) {
                    StickerView stickerView = this.f13881f;
                    if (stickerView != null) {
                        stickerView.m56979j(this.f13883h, str, true, false, false, true);
                    }
                } else {
                    C28020b3.f130648a.m141183G(this.f13883h, this.f13884i, this.f13881f, this.f13882g, false);
                }
            }
            m16491v();
        }

        /* renamed from: t */
        void m16489t(String str) {
            C31967j.m153687a().m153692f(0, str, null, 0, new C32690a(), AbstractC23309i.m121977hc());
        }

        /* renamed from: u */
        void m16490u() {
            try {
                if (this.f13883h != null) {
                    if (!C20024r.m103941j() && !C7853b.m40052a0().m40133i0()) {
                        if (!C7853b.m40052a0().m40137k0()) {
                            this.f13881f.m56979j(this.f13883h, System.currentTimeMillis() + "", true, false, false, true);
                            if (this.f13883h.m132399G() && !TextUtils.isEmpty(this.f13883h.m132435m())) {
                                m16489t(this.f13883h.m132435m());
                                return;
                            }
                            return;
                        }
                        m16482A();
                        return;
                    }
                    PushToTalkControl.C16482c.m87894a();
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        /* renamed from: v */
        public a m16491v() {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: c30.d0
                @Override // java.lang.Runnable
                public final void run() {
                    C3246i0.a.this.m16481r();
                }
            });
            return this;
        }

        /* renamed from: w */
        public a m16492w(String str, InterfaceC17463d.d dVar) {
            this.f13879d = str;
            this.f13886k = dVar;
            return this;
        }

        /* renamed from: x */
        public a m16493x(String str, InterfaceC17463d.d dVar) {
            this.f13878c = str;
            this.f13885j = dVar;
            return this;
        }

        /* renamed from: y */
        public a m16494y(C25630b c25630b) {
            this.f13883h = c25630b;
            return this;
        }

        /* renamed from: z */
        public a m16495z(String str) {
            this.f13877b = str;
            return this;
        }
    }

    public C3246i0(Context context, int i11) {
        super(context, i11);
    }
}
