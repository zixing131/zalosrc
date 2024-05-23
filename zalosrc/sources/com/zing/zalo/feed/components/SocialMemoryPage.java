package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bo.C3056x1;
import br.InterfaceC3116a;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.feed.mvp.socialmemory.SocialMemoryView;
import com.zing.zalo.zview.AbstractC17484n;
import me0.AbstractC23136l9;
import p354n3.C23528a;
import p716zh.AbstractC31969j1;
import zl0.AbstractC32229f;

/* loaded from: classes4.dex */
public class SocialMemoryPage extends BaseSocialMemoryPage implements View.OnClickListener {

    /* renamed from: B */
    ViewGroup f45147B;

    /* renamed from: C */
    SocialMemoryFeedItem f45148C;

    /* renamed from: D */
    View f45149D;

    /* renamed from: E */
    GestureDetector f45150E;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.feed.components.SocialMemoryPage$a */
    /* loaded from: classes4.dex */
    public class C8223a extends GestureDetector.SimpleOnGestureListener {
        C8223a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            InterfaceC3116a interfaceC3116a = SocialMemoryPage.this.f44136x;
            if (interfaceC3116a != null) {
                interfaceC3116a.mo15736Pk();
                return true;
            }
            return true;
        }
    }

    public SocialMemoryPage(Context context) {
        this(context, null);
    }

    /* renamed from: k */
    public /* synthetic */ boolean m44524k(View view, MotionEvent motionEvent) {
        return this.f45150E.onTouchEvent(motionEvent);
    }

    /* renamed from: l */
    private void m44525l() {
        View view;
        TextView textView;
        try {
            InterfaceC3116a interfaceC3116a = this.f44136x;
            if (interfaceC3116a instanceof SocialMemoryView) {
                view = ((SocialMemoryView) interfaceC3116a).m92656bJ();
            } else {
                view = null;
            }
            if (view != null && AbstractC32229f.m155443o(view) && (textView = this.f44130r) != null && (textView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f44130r.getLayoutParams();
                marginLayoutParams.setMargins(0, AbstractC23136l9.m118655I(AbstractC16802y.social_memory_title_mg_top) + AbstractC17484n.Companion.m92931b(), 0, 0);
                this.f44130r.setLayoutParams(marginLayoutParams);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: c */
    public void mo43512c(C3056x1 c3056x1, C23528a c23528a) {
        super.mo43512c(c3056x1, c23528a);
        this.f45148C.m44509a(c3056x1, c23528a);
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: g */
    public void mo43516g() {
        super.mo43516g();
        this.f45147B = (ViewGroup) findViewById(AbstractC6918a0.feed_item_view_container);
        SocialMemoryFeedItem socialMemoryFeedItem = (SocialMemoryFeedItem) findViewById(AbstractC6918a0.feed_item_view);
        this.f45148C = socialMemoryFeedItem;
        socialMemoryFeedItem.m44512h(this.f44137y, this.f45147B);
        this.f45149D = findViewById(AbstractC6918a0.click_view);
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    protected int getBackgroundColorDefault() {
        InterfaceC3116a interfaceC3116a = this.f44136x;
        if (interfaceC3116a != null) {
            return interfaceC3116a.mo15739tx(this.f44135w);
        }
        return SocialMemoryView.f46925H1;
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    public View getContentView() {
        return this.f45147B;
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    int getLayoutResource() {
        return AbstractC7409c0.social_memory_page_view;
    }

    @Override // com.zing.zalo.feed.components.BaseSocialMemoryPage
    /* renamed from: i */
    public void mo43517i() {
        super.mo43517i();
        this.f45149D.setOnTouchListener(new View.OnTouchListener() { // from class: com.zing.zalo.feed.components.f7
            public /* synthetic */ ViewOnTouchListenerC8277f7() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m44524k;
                m44524k = SocialMemoryPage.this.m44524k(view, motionEvent);
                return m44524k;
            }
        });
        Typeface m153697b = AbstractC31969j1.m153697b(getContext(), 0);
        if (m153697b != null) {
            this.f44130r.setTypeface(m153697b);
        }
        m44525l();
        Typeface m153697b2 = AbstractC31969j1.m153697b(getContext(), 5);
        if (m153697b != null) {
            this.f44131s.setTypeface(m153697b2);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC3116a interfaceC3116a;
        if (view.getId() == AbstractC6918a0.click_view && (interfaceC3116a = this.f44136x) != null) {
            interfaceC3116a.mo15736Pk();
        }
    }

    public SocialMemoryPage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SocialMemoryPage(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f45150E = new GestureDetector(context, new C8223a());
    }
}
