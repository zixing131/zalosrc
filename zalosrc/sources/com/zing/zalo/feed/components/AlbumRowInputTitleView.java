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
import com.zing.zalo.feed.components.AlbumRowInputTitleView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.C16572d1;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import ed0.AbstractC18391a;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import me0.AbstractC23136l9;
import p227i3.C20215s;
import p649xl.C29942n6;

/* loaded from: classes4.dex */
public final class AlbumRowInputTitleView extends RelativeLayout {

    /* renamed from: p */
    private AbstractC18391a f44106p;

    /* renamed from: q */
    private C29942n6 f44107q;

    /* renamed from: r */
    private InterfaceC8064a f44108r;

    /* renamed from: s */
    private C16572d1 f44109s;

    /* renamed from: com.zing.zalo.feed.components.AlbumRowInputTitleView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8064a {

        /* renamed from: com.zing.zalo.feed.components.AlbumRowInputTitleView$a$a */
        /* loaded from: classes4.dex */
        public static final class a {
            /* renamed from: a */
            public static void m43460a(InterfaceC8064a interfaceC8064a, String str) {
                AbstractC19074t.m100208f(str, C20215s.f99966b);
            }
        }

        /* renamed from: z2 */
        void mo43434z2(String str);
    }

    /* renamed from: com.zing.zalo.feed.components.AlbumRowInputTitleView$b */
    /* loaded from: classes4.dex */
    public static final class C8065b extends AbstractC18391a {

        /* renamed from: p */
        final /* synthetic */ C29942n6 f44110p;

        /* renamed from: q */
        final /* synthetic */ AlbumRowInputTitleView f44111q;

        /* renamed from: r */
        final /* synthetic */ C2984i f44112r;

        C8065b(C29942n6 c29942n6, AlbumRowInputTitleView albumRowInputTitleView, C2984i c2984i) {
            this.f44110p = c29942n6;
            this.f44111q = albumRowInputTitleView;
            this.f44112r = c2984i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m43462b(C29942n6 c29942n6, AlbumRowInputTitleView albumRowInputTitleView, C2984i c2984i, String str, int i11, int i12) {
            AbstractC19074t.m100208f(c29942n6, "$this_configInput");
            AbstractC19074t.m100208f(albumRowInputTitleView, "this$0");
            AbstractC19074t.m100208f(c2984i, "$albumRowInputData");
            if (i12 != 0) {
                c29942n6.f138765s.setText(str);
                if (i12 == -2) {
                    c29942n6.f138765s.setSelection(str.length());
                    ToastUtils.m89268p(AbstractC23136l9.m118746s0(AbstractC8020f0.str_profile_album_create_album_maximum_line, 2));
                } else {
                    c29942n6.f138765s.setSelection(i11);
                }
            }
            InterfaceC8064a albumRowInputTitleListener = albumRowInputTitleView.getAlbumRowInputTitleListener();
            if (albumRowInputTitleListener != null) {
                AbstractC19074t.m100205c(str);
                albumRowInputTitleListener.mo43434z2(str);
            }
            AbstractC19074t.m100205c(str);
            c2984i.m14151e(str);
            albumRowInputTitleView.m43454d(c29942n6, String.valueOf(c29942n6.f138765s.getText()), c2984i);
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            String valueOf = String.valueOf(editable);
            int selectionEnd = this.f44110p.f138765s.getSelectionEnd();
            final C29942n6 c29942n6 = this.f44110p;
            final AlbumRowInputTitleView albumRowInputTitleView = this.f44111q;
            final C2984i c2984i = this.f44112r;
            AbstractC20826v0.m108811h(valueOf, selectionEnd, 40, 2, new AbstractC20826v0.i() { // from class: com.zing.zalo.feed.components.h
                @Override // is.AbstractC20826v0.i
                /* renamed from: a */
                public final void mo44661a(String str, int i11, int i12) {
                    AlbumRowInputTitleView.C8065b.m43462b(C29942n6.this, albumRowInputTitleView, c2984i, str, i11, i12);
                }
            });
        }
    }

    public AlbumRowInputTitleView(Context context) {
        super(context);
        m43459h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final void m43454d(C29942n6 c29942n6, String str, C2984i c2984i) {
        int i11;
        RobotoTextView robotoTextView = c29942n6.f138764r;
        robotoTextView.setText(str.length() + "/" + c2984i.m14149c());
        if (str.length() > 0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        robotoTextView.setVisibility(i11);
    }

    /* renamed from: e */
    private final void m43455e(C29942n6 c29942n6, C2984i c2984i) {
        CustomEditText customEditText = c29942n6.f138765s;
        String valueOf = String.valueOf(customEditText.getText());
        if (!AbstractC19074t.m100204b(valueOf, c2984i.m14148b())) {
            customEditText.setText(c2984i.m14148b());
        }
        if (!AbstractC19074t.m100204b(customEditText.getHint(), c2984i.m14147a())) {
            customEditText.setHint(c2984i.m14147a());
        }
        AbstractC18391a abstractC18391a = this.f44106p;
        if (abstractC18391a != null) {
            customEditText.removeTextChangedListener(abstractC18391a);
        }
        C8065b c8065b = new C8065b(c29942n6, this, c2984i);
        this.f44106p = c8065b;
        customEditText.addTextChangedListener(c8065b);
        customEditText.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.feed.components.g
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                AlbumRowInputTitleView.m43456f(view, z11);
            }
        });
        m43454d(c29942n6, valueOf, c2984i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m43456f(View view, boolean z11) {
        if (!z11) {
            AbstractC2379w.m12430d(view);
        }
    }

    /* renamed from: g */
    private final void m43457g(C29942n6 c29942n6, C2984i c2984i) {
        int i11;
        View view = c29942n6.f138766t;
        if (c2984i.m14150d()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
    }

    /* renamed from: c */
    public final void m43458c(C2984i c2984i) {
        if (c2984i == null) {
            return;
        }
        C29942n6 c29942n6 = this.f44107q;
        if (c29942n6 == null) {
            AbstractC19074t.m100223u("binding");
            c29942n6 = null;
        }
        m43455e(c29942n6, c2984i);
        m43457g(c29942n6, c2984i);
    }

    public final InterfaceC8064a getAlbumRowInputTitleListener() {
        return this.f44108r;
    }

    /* renamed from: h */
    public final void m43459h(Context context) {
        C29942n6 m148276c = C29942n6.m148276c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m148276c, "inflate(...)");
        this.f44107q = m148276c;
        if (m148276c == null) {
            AbstractC19074t.m100223u("binding");
            m148276c = null;
        }
        m148276c.f138765s.setForceHideClearBtn(true);
        C29942n6 c29942n6 = this.f44107q;
        if (c29942n6 == null) {
            AbstractC19074t.m100223u("binding");
            c29942n6 = null;
        }
        this.f44109s = new C16572d1(c29942n6.f138765s, false, null);
    }

    public final void setAlbumRowInputTitleListener(InterfaceC8064a interfaceC8064a) {
        this.f44108r = interfaceC8064a;
    }

    public AlbumRowInputTitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m43459h(context);
    }
}
