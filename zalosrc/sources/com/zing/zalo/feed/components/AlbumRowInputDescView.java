package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import au.AbstractC2379w;
import bo.C2984i;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.components.AlbumRowInputDescView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import ed0.AbstractC18391a;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import me0.AbstractC23136l9;
import p227i3.C20215s;
import p649xl.C29924m6;

/* loaded from: classes4.dex */
public final class AlbumRowInputDescView extends RelativeLayout {

    /* renamed from: p */
    private AbstractC18391a f44099p;

    /* renamed from: q */
    private C29924m6 f44100q;

    /* renamed from: r */
    private InterfaceC8062a f44101r;

    /* renamed from: s */
    private C16572d1 f44102s;

    /* renamed from: com.zing.zalo.feed.components.AlbumRowInputDescView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8062a {

        /* renamed from: com.zing.zalo.feed.components.AlbumRowInputDescView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m43449a(InterfaceC8062a interfaceC8062a, String str) {
                AbstractC19074t.m100208f(str, C20215s.f99966b);
            }
        }

        /* renamed from: V3 */
        void mo43421V3(String str);
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumRowInputDescView$b */
    /* loaded from: classes4.dex */
    public static final class C8063b extends AbstractC18391a {

        /* renamed from: p */
        final /* synthetic */ C29924m6 f44103p;

        /* renamed from: q */
        final /* synthetic */ AlbumRowInputDescView f44104q;

        /* renamed from: r */
        final /* synthetic */ C2984i f44105r;

        C8063b(C29924m6 c29924m6, AlbumRowInputDescView albumRowInputDescView, C2984i c2984i) {
            this.f44103p = c29924m6;
            this.f44104q = albumRowInputDescView;
            this.f44105r = c2984i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m43451b(C29924m6 c29924m6, AlbumRowInputDescView albumRowInputDescView, C2984i c2984i, String str, int i11, int i12) {
            AbstractC19074t.m100208f(c29924m6, "$this_configInput");
            AbstractC19074t.m100208f(albumRowInputDescView, "this$0");
            AbstractC19074t.m100208f(c2984i, "$albumRowInputData");
            if (i12 != 0) {
                c29924m6.f138663s.setText(str);
                if (i12 == -2) {
                    c29924m6.f138663s.setSelection(str.length());
                    ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_profile_album_create_album_maximum_line, 5));
                } else {
                    c29924m6.f138663s.setSelection(i11);
                }
            }
            InterfaceC8062a albumRowInputDescListener = albumRowInputDescView.getAlbumRowInputDescListener();
            if (albumRowInputDescListener != null) {
                AbstractC19074t.m100205c(str);
                albumRowInputDescListener.mo43421V3(str);
            }
            AbstractC19074t.m100205c(str);
            c2984i.m14151e(str);
            albumRowInputDescView.m43444d(c29924m6, String.valueOf(c29924m6.f138663s.getText()), c2984i);
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String valueOf = String.valueOf(editable);
            int selectionEnd = this.f44103p.f138663s.getSelectionEnd();
            final C29924m6 c29924m6 = this.f44103p;
            final AlbumRowInputDescView albumRowInputDescView = this.f44104q;
            final C2984i c2984i = this.f44105r;
            AbstractC20826v0.m108811h(valueOf, selectionEnd, 150, 5, new AbstractC20826v0.i() { // from class: com.zing.zalo.feed.components.f
                @Override // is.AbstractC20826v0.i
                /* renamed from: a */
                public final void mo44661a(String str, int i11, int i12) {
                    AlbumRowInputDescView.C8063b.m43451b(C29924m6.this, albumRowInputDescView, c2984i, str, i11, i12);
                }
            });
        }
    }

    public AlbumRowInputDescView(Context context) {
        super(context);
        m43448g(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m43444d(C29924m6 c29924m6, String str, C2984i c2984i) {
        int i11;
        RobotoTextView robotoTextView = c29924m6.f138662r;
        int i12 = 0;
        if (str.length() > 0) {
            i11 = str.length();
        } else {
            i11 = 0;
        }
        robotoTextView.setText(i11 + "/" + c2984i.m14149c());
        if (str.length() <= 0) {
            i12 = 8;
        }
        robotoTextView.setVisibility(i12);
    }

    /* renamed from: e */
    private final void m43445e(C29924m6 c29924m6, C2984i c2984i) {
        CustomEditText customEditText = c29924m6.f138663s;
        String valueOf = String.valueOf(customEditText.getText());
        if (!AbstractC19074t.m100204b(valueOf, c2984i.m14148b())) {
            customEditText.setText(c2984i.m14148b());
        }
        if (!AbstractC19074t.m100204b(customEditText.getHint(), c2984i.m14147a())) {
            customEditText.setHint(c2984i.m14147a());
        }
        AbstractC18391a abstractC18391a = this.f44099p;
        if (abstractC18391a != null) {
            customEditText.removeTextChangedListener(abstractC18391a);
        }
        C8063b c8063b = new C8063b(c29924m6, this, c2984i);
        this.f44099p = c8063b;
        customEditText.addTextChangedListener(c8063b);
        customEditText.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.feed.components.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                AlbumRowInputDescView.m43446f(view, z11);
            }
        });
        m43444d(c29924m6, valueOf, c2984i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m43446f(View view, boolean z11) {
        if (!z11) {
            AbstractC2379w.m12430d(view);
        }
    }

    /* renamed from: c */
    public final void m43447c(C2984i c2984i) {
        if (c2984i == null) {
            return;
        }
        C29924m6 c29924m6 = this.f44100q;
        if (c29924m6 == null) {
            AbstractC19074t.m100223u("binding");
            c29924m6 = null;
        }
        m43445e(c29924m6, c2984i);
    }

    /* renamed from: g */
    public final void m43448g(Context context) {
        C29924m6 m148240c = C29924m6.m148240c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148240c, "inflate(...)");
        this.f44100q = m148240c;
        if (m148240c == null) {
            AbstractC19074t.m100223u("binding");
            m148240c = null;
        }
        m148240c.f138663s.setForceHideClearBtn(true);
        C29924m6 c29924m6 = this.f44100q;
        if (c29924m6 == null) {
            AbstractC19074t.m100223u("binding");
            c29924m6 = null;
        }
        this.f44102s = new C16572d1(c29924m6.f138663s, false, null);
    }

    public final InterfaceC8062a getAlbumRowInputDescListener() {
        return this.f44101r;
    }

    public final void setAlbumRowInputDescListener(InterfaceC8062a interfaceC8062a) {
        this.f44101r = interfaceC8062a;
    }

    public AlbumRowInputDescView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43448g(context);
    }
}
