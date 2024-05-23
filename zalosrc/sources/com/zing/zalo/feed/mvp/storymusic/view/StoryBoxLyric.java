package com.zing.zalo.feed.mvp.storymusic.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import bo.InterfaceC2992j2;
import bo.InterfaceC2997k2;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import com.zing.zalo.feed.mvp.storymusic.model.StoryMusicAttachment;
import com.zing.zalo.feed.mvp.storymusic.view.StoryBoxLyric;
import com.zing.zalo.p077ui.widget.StickerProgressView;
import fn0.AbstractC19074t;
import gf.C19435a;
import ho0.AbstractC20110a;
import kr.InterfaceC21910a;
import kr.InterfaceC21911b;
import me0.AbstractC23136l9;
import me0.C23278z2;
import p160ff.C18903a;
import p166fq.AbstractC19111h;
import p166fq.AbstractC19118o;
import p166fq.C19121r;
import p166fq.C19124u;
import p166fq.C19127x;
import p237if.C20527a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p649xl.C29733bd;

/* loaded from: classes4.dex */
public final class StoryBoxLyric extends RelativeLayout {

    /* renamed from: p */
    private C29733bd f47057p;

    /* renamed from: q */
    private AbstractC19118o f47058q;

    /* renamed from: r */
    private int f47059r;

    /* renamed from: s */
    private C18903a f47060s;

    /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StoryBoxLyric$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8773a {
        /* renamed from: a */
        void mo46964a(InterfaceC21910a interfaceC21910a);
    }

    /* renamed from: com.zing.zalo.feed.mvp.storymusic.view.StoryBoxLyric$b */
    /* loaded from: classes4.dex */
    public static final class C8774b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ String f47061l1;

        /* renamed from: m1 */
        final /* synthetic */ RecyclingImageView f47062m1;

        /* renamed from: n1 */
        final /* synthetic */ StoryBoxLyric f47063n1;

        C8774b(String str, RecyclingImageView recyclingImageView, StoryBoxLyric storyBoxLyric) {
            this.f47061l1 = str;
            this.f47062m1 = recyclingImageView;
            this.f47063n1 = storyBoxLyric;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: H3 */
        public static final void m46966H3(StoryBoxLyric storyBoxLyric, C3979l c3979l, RecyclingImageView recyclingImageView) {
            AbstractC19074t.m100208f(storyBoxLyric, "this$0");
            AbstractC19074t.m100208f(recyclingImageView, "$dumpView");
            C29733bd c29733bd = storyBoxLyric.f47057p;
            if (c29733bd == null) {
                AbstractC19074t.m100223u("binding");
                c29733bd = null;
            }
            RecyclingImageView recyclingImageView2 = c29733bd.f137352q;
            C18903a c18903a = storyBoxLyric.f47060s;
            if (c18903a == null) {
                AbstractC19074t.m100223u("musicBadge");
                c18903a = null;
            }
            Bitmap m18839c = c3979l.m18839c();
            AbstractC19074t.m100207e(m18839c, "getBitmap(...)");
            recyclingImageView2.setImageBitmap(c18903a.m99091c(m18839c));
            C29733bd c29733bd2 = storyBoxLyric.f47057p;
            if (c29733bd2 == null) {
                AbstractC19074t.m100223u("binding");
                c29733bd2 = null;
            }
            c29733bd2.f137352q.setVisibility(0);
            recyclingImageView.setImageInfo(null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, final C3979l c3979l, C23995f c23995f) {
            AbstractC19074t.m100208f(interfaceC3968a, "iv");
            AbstractC19074t.m100208f(c23995f, "status");
            if (str != null) {
                try {
                    if (AbstractC19074t.m100204b(str, this.f47061l1) && c3979l != null && c3979l.m18839c() != null) {
                        this.f47062m1.setImageInfo(c3979l, true);
                        final StoryBoxLyric storyBoxLyric = this.f47063n1;
                        final RecyclingImageView recyclingImageView = this.f47062m1;
                        storyBoxLyric.post(new Runnable() { // from class: mr.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                StoryBoxLyric.C8774b.m46966H3(StoryBoxLyric.this, c3979l, recyclingImageView);
                            }
                        });
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryBoxLyric(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f47059r = -1;
        m46963h(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m46958f(InterfaceC8773a interfaceC8773a, InterfaceC21910a interfaceC21910a, View view) {
        AbstractC19074t.m100208f(interfaceC21910a, "$data");
        if (interfaceC8773a != null) {
            interfaceC8773a.mo46964a(interfaceC21910a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m46959g(InterfaceC8773a interfaceC8773a, InterfaceC21910a interfaceC21910a, View view) {
        AbstractC19074t.m100208f(interfaceC21910a, "$data");
        if (interfaceC8773a != null) {
            interfaceC8773a.mo46964a(interfaceC21910a);
        }
    }

    /* renamed from: i */
    private final void m46960i(InterfaceC21910a interfaceC21910a) {
        InterfaceC21911b interfaceC21911b;
        int i11;
        int i12;
        StoryMusicAttachment mo46948b;
        StoryMusicAttachment mo46948b2;
        StoryMusicAttachment mo46948b3;
        InterfaceC2997k2 mo14160c = interfaceC21910a.mo14160c();
        InterfaceC2992j2 mo14161e = interfaceC21910a.mo14161e();
        C29733bd c29733bd = null;
        if (mo14161e instanceof InterfaceC21911b) {
            interfaceC21911b = (InterfaceC21911b) mo14161e;
        } else {
            interfaceC21911b = null;
        }
        int i13 = -1;
        if (interfaceC21911b != null && (mo46948b3 = interfaceC21911b.mo46948b()) != null) {
            i11 = mo46948b3.m46924b();
        } else {
            i11 = -1;
        }
        if (i11 != -1 && this.f47059r != i11) {
            if (i11 == 4 && mo14160c.mo14230d().length() == 0) {
                return;
            }
            this.f47059r = i11;
            AbstractC19118o abstractC19118o = this.f47058q;
            if (abstractC19118o != null) {
                abstractC19118o.m100378g();
            }
            this.f47058q = null;
            C29733bd c29733bd2 = this.f47057p;
            if (c29733bd2 == null) {
                AbstractC19074t.m100223u("binding");
                c29733bd2 = null;
            }
            c29733bd2.f137354s.setAlpha(1.0f);
            C29733bd c29733bd3 = this.f47057p;
            if (c29733bd3 == null) {
                AbstractC19074t.m100223u("binding");
                c29733bd3 = null;
            }
            c29733bd3.f137354s.setTranslationY(0.0f);
            C29733bd c29733bd4 = this.f47057p;
            if (c29733bd4 == null) {
                AbstractC19074t.m100223u("binding");
                c29733bd4 = null;
            }
            c29733bd4.f137354s.setScaleX(1.0f);
            C29733bd c29733bd5 = this.f47057p;
            if (c29733bd5 == null) {
                AbstractC19074t.m100223u("binding");
                c29733bd5 = null;
            }
            c29733bd5.f137354s.setScaleY(1.0f);
            boolean z11 = false;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2 && i11 != 3) {
                    if (i11 == 4) {
                        C29733bd c29733bd6 = this.f47057p;
                        if (c29733bd6 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29733bd6 = null;
                        }
                        AbstractC23136l9.m118744r1(c29733bd6.f137354s, 8);
                        C29733bd c29733bd7 = this.f47057p;
                        if (c29733bd7 == null) {
                            AbstractC19074t.m100223u("binding");
                            c29733bd7 = null;
                        }
                        AbstractC23136l9.m118744r1(c29733bd7.f137352q, 0);
                    }
                } else {
                    C29733bd c29733bd8 = this.f47057p;
                    if (c29733bd8 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29733bd8 = null;
                    }
                    AbstractC23136l9.m118744r1(c29733bd8.f137354s, 0);
                    C29733bd c29733bd9 = this.f47057p;
                    if (c29733bd9 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29733bd9 = null;
                    }
                    AbstractC23136l9.m118744r1(c29733bd9.f137352q, 8);
                }
            } else {
                C29733bd c29733bd10 = this.f47057p;
                if (c29733bd10 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29733bd10 = null;
                }
                AbstractC23136l9.m118744r1(c29733bd10.f137354s, 8);
                C29733bd c29733bd11 = this.f47057p;
                if (c29733bd11 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29733bd11 = null;
                }
                AbstractC23136l9.m118744r1(c29733bd11.f137352q, 8);
            }
            C19435a c19435a = C19435a.f96406a;
            C19435a.a m101601d = c19435a.m101601d(i11);
            if (i11 == 1 || i11 == 2 || i11 == 3) {
                C29733bd c29733bd12 = this.f47057p;
                if (c29733bd12 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29733bd12 = null;
                }
                ViewGroup.LayoutParams layoutParams = c29733bd12.f137354s.getLayoutParams();
                if (m101601d != null) {
                    layoutParams.width = m101601d.m101606d();
                }
                C29733bd c29733bd13 = this.f47057p;
                if (c29733bd13 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29733bd13 = null;
                }
                c29733bd13.f137354s.setLayoutParams(layoutParams);
                if (interfaceC21911b != null && (mo46948b = interfaceC21911b.mo46948b()) != null) {
                    i12 = mo46948b.m46925c();
                } else {
                    i12 = -1;
                }
                Typeface m101602e = c19435a.m101602e(i12, c19435a.m101598a(i12));
                if (m101602e != null) {
                    C29733bd c29733bd14 = this.f47057p;
                    if (c29733bd14 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29733bd14 = null;
                    }
                    c29733bd14.f137354s.setTypeface(m101602e);
                }
                if (m101601d != null) {
                    C29733bd c29733bd15 = this.f47057p;
                    if (c29733bd15 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29733bd15 = null;
                    }
                    c29733bd15.f137354s.setTextSize(0, m101601d.m101605c());
                }
            }
            if (interfaceC21911b != null && (mo46948b2 = interfaceC21911b.mo46948b()) != null) {
                i13 = mo46948b2.m46925c();
            } else if (m101601d != null) {
                i13 = m101601d.m101603a();
            }
            if (m101601d != null && C20527a.m106639a(i13)) {
                z11 = true;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        AbstractC19111h.a aVar = AbstractC19111h.Companion;
                        C29733bd c29733bd16 = this.f47057p;
                        if (c29733bd16 == null) {
                            AbstractC19074t.m100223u("binding");
                        } else {
                            c29733bd = c29733bd16;
                        }
                        TextView textView = c29733bd.f137354s;
                        AbstractC19074t.m100207e(textView, "textCurrent");
                        this.f47058q = new C19127x(aVar.m100354a(textView), z11);
                    }
                } else {
                    AbstractC19111h.a aVar2 = AbstractC19111h.Companion;
                    C29733bd c29733bd17 = this.f47057p;
                    if (c29733bd17 == null) {
                        AbstractC19074t.m100223u("binding");
                    } else {
                        c29733bd = c29733bd17;
                    }
                    TextView textView2 = c29733bd.f137354s;
                    AbstractC19074t.m100207e(textView2, "textCurrent");
                    this.f47058q = new C19124u(aVar2.m100354a(textView2), z11);
                }
            } else {
                AbstractC19111h.a aVar3 = AbstractC19111h.Companion;
                C29733bd c29733bd18 = this.f47057p;
                if (c29733bd18 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29733bd = c29733bd18;
                }
                TextView textView3 = c29733bd.f137354s;
                AbstractC19074t.m100207e(textView3, "textCurrent");
                this.f47058q = new C19121r(aVar3.m100354a(textView3), -AbstractC23136l9.m118742r(20.0f), z11);
            }
            if (i11 == 4) {
                m46961j(interfaceC21910a.mo14159b(), mo14160c);
            }
        }
    }

    /* renamed from: j */
    private final void m46961j(String str, InterfaceC2997k2 interfaceC2997k2) {
        C18903a c18903a = this.f47060s;
        C29733bd c29733bd = null;
        if (c18903a == null) {
            AbstractC19074t.m100223u("musicBadge");
            c18903a = null;
        }
        if (!AbstractC19074t.m100204b(c18903a.m99093e(), str) && interfaceC2997k2.mo14230d().length() != 0) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            this.f47060s = new C18903a(context, str, interfaceC2997k2.mo14230d(), interfaceC2997k2.mo14227a(), interfaceC2997k2.mo14229c());
            RecyclingImageView recyclingImageView = new RecyclingImageView(getContext());
            C23528a c23528a = new C23528a(getContext());
            String mo14230d = interfaceC2997k2.mo14230d();
            C24003n m120143n = C23278z2.m120143n();
            C29733bd c29733bd2 = this.f47057p;
            if (c29733bd2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29733bd = c29733bd2;
            }
            c29733bd.f137352q.setVisibility(8);
            ((C23528a) c23528a.m123612r(recyclingImageView)).m123579C(mo14230d, m120143n, new C8774b(mo14230d, recyclingImageView, this));
        }
    }

    /* renamed from: e */
    public final void m46962e(final InterfaceC21910a interfaceC21910a, final InterfaceC8773a interfaceC8773a) {
        InterfaceC21911b interfaceC21911b;
        int i11;
        AbstractC19074t.m100208f(interfaceC21910a, "data");
        m46960i(interfaceC21910a);
        InterfaceC2992j2 mo14161e = interfaceC21910a.mo14161e();
        C29733bd c29733bd = null;
        if (mo14161e instanceof InterfaceC21911b) {
            interfaceC21911b = (InterfaceC21911b) mo14161e;
        } else {
            interfaceC21911b = null;
        }
        if (interfaceC21911b != null) {
            LyricRender mo14189c = interfaceC21911b.mo14189c();
            C29733bd c29733bd2 = this.f47057p;
            if (c29733bd2 == null) {
                AbstractC19074t.m100223u("binding");
                c29733bd2 = null;
            }
            StickerProgressView stickerProgressView = c29733bd2.f137353r;
            if (mo14189c.m45712i()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            stickerProgressView.setVisibility(i11);
            C29733bd c29733bd3 = this.f47057p;
            if (c29733bd3 == null) {
                AbstractC19074t.m100223u("binding");
                c29733bd3 = null;
            }
            c29733bd3.f137353r.setLoadingView(mo14189c.m45712i());
            if (C20527a.m106641c(interfaceC21911b.mo46948b().m46924b())) {
                AbstractC19118o abstractC19118o = this.f47058q;
                if (abstractC19118o != null) {
                    abstractC19118o.mo100372a(mo14189c);
                }
                C29733bd c29733bd4 = this.f47057p;
                if (c29733bd4 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29733bd = c29733bd4;
                }
                c29733bd.f137354s.setOnClickListener(new View.OnClickListener() { // from class: mr.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StoryBoxLyric.m46958f(StoryBoxLyric.InterfaceC8773a.this, interfaceC21910a, view);
                    }
                });
                return;
            }
            if (C20527a.m106640b(interfaceC21911b.mo46948b().m46924b())) {
                m46961j(interfaceC21910a.mo14159b(), interfaceC21910a.mo14160c());
                C29733bd c29733bd5 = this.f47057p;
                if (c29733bd5 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29733bd = c29733bd5;
                }
                c29733bd.f137352q.setOnClickListener(new View.OnClickListener() { // from class: mr.b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        StoryBoxLyric.m46959g(StoryBoxLyric.InterfaceC8773a.this, interfaceC21910a, view);
                    }
                });
            }
        }
    }

    /* renamed from: h */
    public final void m46963h(Context context) {
        AbstractC19074t.m100208f(context, "context");
        C29733bd m147783c = C29733bd.m147783c(LayoutInflater.from(context), this, true);
        AbstractC19074t.m100207e(m147783c, "inflate(...)");
        this.f47057p = m147783c;
        if (m147783c == null) {
            AbstractC19074t.m100223u("binding");
            m147783c = null;
        }
        m147783c.f137354s.setShadowLayer(AbstractC23136l9.m118742r(3.0f), 0.0f, 0.0f, Color.parseColor("#33000000"));
        this.f47060s = new C18903a(context, null, null, null, null, 30, null);
    }
}
