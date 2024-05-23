package com.zing.zalo.social.components;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import au.C2370r0;
import bi0.AbstractC2807a;
import com.androidquery.util.C3979l;
import com.androidquery.util.C3980m;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.imageview.RoundedImageView;
import com.zing.zalo.social.components.NotificationItemViewDefault;
import com.zing.zalo.zdesign.component.Avatar;
import ho0.AbstractC20110a;
import is.AbstractC20833z;
import java.util.ArrayList;
import l30.AbstractC22047r0;
import l30.AbstractC22055v0;
import me0.AbstractC23006a0;
import me0.AbstractC23170p;
import me0.AbstractC23265y;
import me0.C23212s8;
import me0.C23278z2;
import mj0.AbstractC23322a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p691yr.C31060j;
import p716zh.C31845ac;
import p716zh.C31890dc;
import p716zh.C31903ea;
import p716zh.C32078q7;
import ui0.C27280g;

/* loaded from: classes5.dex */
public class NotificationItemViewDefault extends NotificationItemViewBase {

    /* renamed from: A */
    public FrameLayout f54755A;

    /* renamed from: B */
    private RecyclingImageView f54756B;

    /* renamed from: C */
    public View f54757C;

    /* renamed from: t */
    public LinearLayout f54758t;

    /* renamed from: u */
    public TextView f54759u;

    /* renamed from: v */
    public RoundedImageView f54760v;

    /* renamed from: w */
    public RecyclingImageView f54761w;

    /* renamed from: x */
    public FrameLayout f54762x;

    /* renamed from: y */
    public ProgressBar f54763y;

    /* renamed from: z */
    public RecyclingImageView f54764z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.social.components.NotificationItemViewDefault$a */
    /* loaded from: classes5.dex */
    public class C10857a extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ C32078q7 f54765l1;

        C10857a(C32078q7 c32078q7) {
            this.f54765l1 = c32078q7;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            if (c3979l.m18839c() != null) {
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                if (C23212s8.m119602i()) {
                    NotificationItemViewDefault.this.setBgEmojiColor(Color.parseColor(AbstractC23265y.m120017d(this.f54765l1.m154756k())));
                    if (this.f54765l1.m154747J() != -1) {
                        NotificationItemViewDefault.this.f54761w.setColorFilter(Color.parseColor(AbstractC23265y.m120017d(this.f54765l1.m154747J())));
                    }
                } else {
                    NotificationItemViewDefault.this.setBgEmojiColor(Color.parseColor(AbstractC23265y.m120017d(this.f54765l1.m154757l())));
                    if (this.f54765l1.m154748K() != -1) {
                        NotificationItemViewDefault.this.f54761w.setColorFilter(Color.parseColor(AbstractC23265y.m120017d(this.f54765l1.m154748K())));
                    }
                }
                NotificationItemViewDefault.this.f54761w.setVisibility(0);
                return;
            }
            NotificationItemViewDefault.this.f54761w.setVisibility(8);
        }
    }

    public NotificationItemViewDefault(Context context) {
        super(context);
    }

    /* renamed from: h */
    private void m56293h(final C32078q7 c32078q7) {
        this.f54755A.setOnClickListener(new View.OnClickListener() { // from class: w20.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotificationItemViewDefault.this.m56296k(c32078q7, view);
            }
        });
    }

    /* renamed from: i */
    private void m56294i(final C32078q7 c32078q7) {
        boolean z11;
        try {
            boolean z12 = false;
            if (c32078q7.m154750M()) {
                this.f54762x.setVisibility(0);
                this.f54760v.setImageResource(AbstractC16803z.bg_thumb_action);
                this.f54760v.setTag(Integer.valueOf(c32078q7.f147751Q));
                final C2370r0 c2370r0 = new C2370r0(this.f54760v);
                C31845ac.m152996J().m153057o0(c32078q7.f147751Q, new C31845ac.e() { // from class: w20.b
                    @Override // p716zh.C31845ac.e
                    /* renamed from: a */
                    public final void mo39491a(int i11, String str, C31890dc c31890dc) {
                        NotificationItemViewDefault.this.m56298m(c2370r0, c32078q7, i11, str, c31890dc);
                    }
                });
            } else {
                this.f54760v.setImageDrawable(AbstractC23170p.m119355m(getContext()));
                if (c32078q7.m154740C().length() > 0) {
                    ((C23528a) this.f54753r.m123612r(this.f54760v)).m123618x(c32078q7.m154740C(), C23278z2.m120136k0());
                    this.f54762x.setVisibility(0);
                } else {
                    this.f54762x.setVisibility(8);
                }
            }
            if (this.f54764z != null) {
                int m154741D = c32078q7.m154741D();
                if (m154741D != 2) {
                    if (m154741D != 3) {
                        this.f54764z.setVisibility(8);
                    } else {
                        this.f54764z.setVisibility(0);
                        this.f54764z.setImageResource(AbstractC16803z.ic_story_music_notification_overlay);
                    }
                } else {
                    this.f54764z.setVisibility(0);
                    this.f54764z.setImageResource(AbstractC16803z.ic_play_story_notify);
                }
            }
            this.f54761w.clearColorFilter();
            this.f54761w.setImageDrawable(null);
            setBgEmojiColor(C23212s8.m119606n(AbstractC16781w.bg_place_holder));
            if (c32078q7.m154752O() && !TextUtils.isEmpty(c32078q7.m154739B())) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (AbstractC20833z.m108918w(c32078q7.m154749L()) && c32078q7.m154762s() > 0) {
                z12 = true;
            }
            if (z11) {
                m56300p(c32078q7);
                return;
            }
            if (z12) {
                m56299n(c32078q7);
            } else if (!TextUtils.isEmpty(c32078q7.m154768y())) {
                m56301q(c32078q7);
            } else {
                this.f54761w.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: j */
    private void m56295j(C32078q7 c32078q7) {
        this.f54759u.setText(c32078q7.m154742E());
        if (c32078q7.f147742H) {
            TextView textView = this.f54759u;
            textView.setTextColor(C23212s8.m119607o(textView.getContext(), AbstractC2807a.link_02));
        } else {
            TextView textView2 = this.f54759u;
            textView2.setTextColor(C23212s8.m119607o(textView2.getContext(), AbstractC2807a.text_02));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m56296k(C32078q7 c32078q7, View view) {
        this.f54754s.mo45896b(c32078q7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m56297l(C2370r0 c2370r0, String str, C3979l c3979l) {
        if (c3979l != null) {
            try {
                RecyclingImageView recyclingImageView = (RecyclingImageView) c2370r0.m12394a();
                if (recyclingImageView.getTag().equals(str)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c3979l);
                    recyclingImageView.setImageInfo(new C3980m(arrayList), false);
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{AbstractC23170p.m119355m(getContext()), new BitmapDrawable(getContext().getResources(), c3979l.m18839c())});
                    recyclingImageView.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(300);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m56298m(final C2370r0 c2370r0, C32078q7 c32078q7, int i11, String str, C31890dc c31890dc) {
        if (i11 == 0 && c31890dc != null) {
            try {
                if (((Integer) ((RecyclingImageView) c2370r0.m12394a()).getTag()).intValue() == c31890dc.f146495a) {
                    C24003n m120133j = C23278z2.m120133j(getContext(), AbstractC23006a0.m117930z(), AbstractC22055v0.m115158r((View) c2370r0.m12394a()));
                    C31903ea c31903ea = C31903ea.f146582a;
                    if (!c31903ea.m153345j(c32078q7.f147752R, c32078q7.f147751Q, 1, m120133j)) {
                        return;
                    }
                    C3979l m153340e = c31903ea.m153340e(c32078q7.f147752R, c32078q7.f147751Q, 1, m120133j);
                    if (m153340e != null) {
                        ((RecyclingImageView) c2370r0.m12394a()).setImageInfo(m153340e);
                    } else {
                        final String m153342g = c31903ea.m153342g(c32078q7.f147752R, c32078q7.f147751Q, 1);
                        ((RecyclingImageView) c2370r0.m12394a()).setTag(m153342g);
                        c31903ea.m153346k(c32078q7.f147752R, c32078q7.f147751Q, c31890dc.m153246p(), m120133j, 1, new C31903ea.b() { // from class: w20.d
                            @Override // p716zh.C31903ea.b
                            /* renamed from: a */
                            public final void mo46919a(C3979l c3979l) {
                                NotificationItemViewDefault.this.m56297l(c2370r0, m153342g, c3979l);
                            }
                        });
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: n */
    private void m56299n(C32078q7 c32078q7) {
        int m154762s = c32078q7.m154762s();
        C31060j c31060j = C31060j.f143193a;
        setBgEmojiColor(c31060j.m150949x(m154762s, getContext()));
        this.f54761w.setImageDrawable(c31060j.m150928C(m154762s, getContext()));
        this.f54761w.setVisibility(0);
    }

    /* renamed from: p */
    private void m56300p(C32078q7 c32078q7) {
        AbstractC22047r0.m115047e(this.f54761w, c32078q7.m154739B(), 24);
        if (C23212s8.m119602i()) {
            setBgEmojiColor(Color.parseColor(AbstractC23265y.m120017d(c32078q7.m154756k())));
        } else {
            setBgEmojiColor(Color.parseColor(AbstractC23265y.m120017d(c32078q7.m154757l())));
        }
        this.f54761w.setVisibility(0);
    }

    /* renamed from: q */
    private void m56301q(C32078q7 c32078q7) {
        ((C23528a) this.f54753r.m123612r(this.f54761w)).m123579C(c32078q7.m154768y(), C23278z2.m120136k0(), new C10857a(c32078q7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBgEmojiColor(int i11) {
        View view = this.f54757C;
        if (view != null) {
            Drawable background = view.getBackground();
            if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(i11);
            }
        }
    }

    @Override // com.zing.zalo.social.components.NotificationItemViewBase
    /* renamed from: c */
    public void mo56288c() {
        try {
            ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(AbstractC7409c0.notification_item, this);
            this.f54758t = (LinearLayout) findViewById(AbstractC6918a0.layoutNotificationItem);
            this.f54751p = (TextView) findViewById(AbstractC6918a0.tvMessage);
            this.f54752q = (Avatar) findViewById(AbstractC6918a0.buddy_dp);
            this.f54759u = (TextView) findViewById(AbstractC6918a0.tvTime);
            this.f54761w = (RecyclingImageView) findViewById(AbstractC6918a0.imvType);
            this.f54760v = (RoundedImageView) findViewById(AbstractC6918a0.thumb_action_item);
            this.f54762x = (FrameLayout) findViewById(AbstractC6918a0.thumb_layout);
            this.f54763y = (ProgressBar) findViewById(AbstractC6918a0.ic_story_loading);
            this.f54764z = (RecyclingImageView) findViewById(AbstractC6918a0.ic_story_overlay);
            this.f54755A = (FrameLayout) findViewById(AbstractC6918a0.setting_layout);
            this.f54756B = (RecyclingImageView) findViewById(AbstractC6918a0.setting_icon);
            this.f54757C = findViewById(AbstractC6918a0.bg_emoji);
            this.f54756B.setImageDrawable(C27280g.m139660c(getContext(), AbstractC23322a.zds_ic_more_horizontal_solid_16, AbstractC2807a.icon_02));
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: r */
    public void m56302r(C32078q7 c32078q7) {
        try {
            if (c32078q7.f147742H) {
                setBackgroundResource(AbstractC16803z.stencils_contact_bg_new_notification);
            } else {
                setBackgroundResource(AbstractC16803z.stencils_contact_bg);
            }
            m56286a(c32078q7);
            m56287b(c32078q7);
            m56295j(c32078q7);
            m56294i(c32078q7);
            m56293h(c32078q7);
            if (c32078q7.f147761a0) {
                this.f54763y.setVisibility(0);
            } else {
                this.f54763y.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
