package com.zing.mp3.sdk.view.widgets;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.zing.mp3.sdk.connection.model.MediaItemInternal;
import com.zing.mp3.sdk.view.widgets.PlaybarView;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC17681d;
import p000.AbstractC17683d0;
import p000.AbstractC23494n;
import p000.AbstractC2471b;
import p000.AbstractC26054s;
import p000.C0011a0;
import p000.C19174g;
import p000.C23969o;
import p000.C24586p;
import p000.C24592p0;
import p000.C2474b0;
import p000.C26434t;
import p000.C28680w;
import p000.C29272x;
import p156fb.AbstractC18857c;
import p156fb.AbstractC18858d;
import p156fb.AbstractC18859e;
import p156fb.AbstractC18860f;
import p156fb.AbstractC18861g;
import p156fb.AbstractC18863i;
import p156fb.InterfaceC18856b;
import pm0.C24848g0;

/* loaded from: classes3.dex */
public final class PlaybarView extends FrameLayout {

    /* renamed from: i0 */
    public static final C26434t f37588i0 = new C26434t();

    /* renamed from: j0 */
    public static Boolean f37589j0;

    /* renamed from: A */
    public ImageView f37590A;

    /* renamed from: B */
    public final Drawable f37591B;

    /* renamed from: C */
    public final Drawable f37592C;

    /* renamed from: D */
    public final int f37593D;

    /* renamed from: E */
    public InterfaceC18856b f37594E;

    /* renamed from: F */
    public int f37595F;

    /* renamed from: G */
    public boolean f37596G;

    /* renamed from: H */
    public boolean f37597H;

    /* renamed from: I */
    public boolean f37598I;

    /* renamed from: J */
    public long f37599J;

    /* renamed from: K */
    public MediaItemInternal f37600K;

    /* renamed from: L */
    public LinkedHashMap f37601L;

    /* renamed from: M */
    public final C28680w f37602M;

    /* renamed from: N */
    public final C24592p0 f37603N;

    /* renamed from: O */
    public boolean f37604O;

    /* renamed from: P */
    public Runnable f37605P;

    /* renamed from: Q */
    public final Runnable f37606Q;

    /* renamed from: R */
    public boolean f37607R;

    /* renamed from: S */
    public boolean f37608S;

    /* renamed from: T */
    public Runnable f37609T;

    /* renamed from: U */
    public final int f37610U;

    /* renamed from: V */
    public final int f37611V;

    /* renamed from: W */
    public final int f37612W;

    /* renamed from: a0 */
    public final int f37613a0;

    /* renamed from: b0 */
    public final int f37614b0;

    /* renamed from: c0 */
    public final int f37615c0;

    /* renamed from: d0 */
    public final int f37616d0;

    /* renamed from: e0 */
    public final int f37617e0;

    /* renamed from: f0 */
    public final int f37618f0;

    /* renamed from: g0 */
    public final int f37619g0;

    /* renamed from: h0 */
    public final int f37620h0;

    /* renamed from: p */
    public final ImageView f37621p;

    /* renamed from: q */
    public final View f37622q;

    /* renamed from: r */
    public final View f37623r;

    /* renamed from: s */
    public final ViewStub f37624s;

    /* renamed from: t */
    public final TextView f37625t;

    /* renamed from: u */
    public final TextView f37626u;

    /* renamed from: v */
    public final ImageView f37627v;

    /* renamed from: w */
    public final WaveBar f37628w;

    /* renamed from: x */
    public final ImageView f37629x;

    /* renamed from: y */
    public final View f37630y;

    /* renamed from: z */
    public final ImageView f37631z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaybarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: a */
    public static void m35256a(View view, float f11) {
        view.setClipToOutline(true);
        view.setOutlineProvider(new C2474b0(f11));
    }

    /* renamed from: c */
    public static final void m35257c(PlaybarView playbarView) {
        AbstractC19074t.m100208f(playbarView, "this$0");
        playbarView.setMode(0);
        InterfaceC18856b interfaceC18856b = playbarView.f37594E;
        if (interfaceC18856b != null) {
            interfaceC18856b.mo66033k(false);
        }
    }

    /* renamed from: d */
    public static final void m35258d(PlaybarView playbarView, Context context, View view) {
        AbstractC19074t.m100208f(playbarView, "this$0");
        AbstractC19074t.m100208f(context, "$context");
        boolean z11 = !playbarView.f37604O;
        if (z11 && !playbarView.f37598I) {
            long currentTimeMillis = System.currentTimeMillis();
            playbarView.f37603N.getClass();
            AbstractC19074t.m100208f(context, "context");
            if (currentTimeMillis - context.getSharedPreferences("mp3sdkdata", 0).getLong("open_music_app", 0L) > playbarView.f37599J) {
                AbstractC26054s.m134147b(context, true, false);
                playbarView.f37603N.getClass();
                AbstractC19074t.m100208f(context, "context");
                context.getSharedPreferences("mp3sdkdata", 0).edit().putLong("open_music_app", System.currentTimeMillis()).apply();
                return;
            }
            AbstractC26054s.m134147b(context, true, true);
            return;
        }
        AbstractC26054s.m134147b(context, z11, playbarView.f37598I);
    }

    /* renamed from: e */
    public static final void m35259e(PlaybarView playbarView, View view) {
        AbstractC19074t.m100208f(playbarView, "this$0");
        InterfaceC18856b interfaceC18856b = playbarView.f37594E;
        if (interfaceC18856b != null) {
            interfaceC18856b.mo66030e();
        }
    }

    /* renamed from: g */
    public static boolean m35260g(MotionEvent motionEvent, View view) {
        if (motionEvent.getX() >= view.getLeft() && motionEvent.getX() <= view.getRight() && motionEvent.getY() >= view.getTop() && motionEvent.getY() <= view.getBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final int m35263j(PlaybarView playbarView) {
        return playbarView.f37604O ? 1 : 0;
    }

    /* renamed from: k */
    public static final void m35264k(PlaybarView playbarView) {
        playbarView.f37600K = null;
        InterfaceC18856b interfaceC18856b = playbarView.f37594E;
        if (interfaceC18856b != null) {
            interfaceC18856b.mo66032j();
        }
    }

    /* renamed from: l */
    public static final void m35265l(PlaybarView playbarView) {
        if (playbarView.f37595F == 1 && playbarView.f37604O) {
            playbarView.postDelayed(playbarView.f37606Q, 5000L);
        }
    }

    /* renamed from: r */
    public static final void m35270r(PlaybarView playbarView) {
        AbstractC19074t.m100208f(playbarView, "this$0");
        playbarView.m35272f(false);
        playbarView.f37605P = null;
    }

    /* renamed from: b */
    public final void m35271b(MediaItemInternal mediaItemInternal) {
        ImageView imageView = this.f37621p;
        String str = mediaItemInternal.f37584u;
        LinkedHashMap linkedHashMap = this.f37601L;
        if (linkedHashMap != null) {
        }
        LinkedHashMap linkedHashMap2 = this.f37601L;
        if (linkedHashMap2 != null) {
            linkedHashMap2.put(Integer.valueOf(imageView.hashCode()), C29272x.f135666q);
        }
        C24848g0 c24848g0 = null;
        if (str != null && str.length() != 0) {
            ImageView imageView2 = this.f37590A;
            if (imageView2 != null) {
                AbstractC19074t.m100208f(imageView2, "<this>");
                imageView2.setVisibility(8);
            }
            AbstractC23494n.m123330f(imageView);
            InterfaceC18856b interfaceC18856b = this.f37594E;
            if (interfaceC18856b != null) {
                interfaceC18856b.mo66029b(imageView, str);
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null) {
                LinkedHashMap linkedHashMap3 = this.f37601L;
                if (linkedHashMap3 == null) {
                    linkedHashMap3 = new LinkedHashMap();
                    this.f37601L = linkedHashMap3;
                }
                linkedHashMap3.put(Integer.valueOf(imageView.hashCode()), new C0011a0(this, imageView, str));
            }
        } else {
            ImageView imageView3 = this.f37590A;
            if (imageView3 == null) {
                View inflate = this.f37624s.inflate();
                AbstractC19074t.m100206d(inflate, "null cannot be cast to non-null type android.widget.ImageView");
                imageView3 = (ImageView) inflate;
                this.f37590A = imageView3;
            }
            AbstractC23494n.m123330f(imageView3);
            AbstractC23494n.m123326b(imageView);
            InterfaceC18856b interfaceC18856b2 = this.f37594E;
            if (interfaceC18856b2 != null) {
                interfaceC18856b2.mo66029b(imageView, "");
                c24848g0 = C24848g0.f119245a;
            }
            if (c24848g0 == null) {
                LinkedHashMap linkedHashMap4 = this.f37601L;
                if (linkedHashMap4 == null) {
                    linkedHashMap4 = new LinkedHashMap();
                    this.f37601L = linkedHashMap4;
                }
                linkedHashMap4.put(Integer.valueOf(imageView.hashCode()), new C0011a0(this, imageView, ""));
            }
        }
        this.f37625t.setText(mediaItemInternal.f37580q);
        this.f37626u.setText(mediaItemInternal.f37581r);
        if (!this.f37597H) {
            InterfaceC18856b interfaceC18856b3 = this.f37594E;
            if (interfaceC18856b3 != null) {
                interfaceC18856b3.mo66031i();
                return;
            }
            return;
        }
        Boolean bool = f37589j0;
        if ((bool == null || AbstractC19074t.m100204b(bool, Boolean.TRUE)) && this.f37604O) {
            f37589j0 = Boolean.TRUE;
            InterfaceC18856b interfaceC18856b4 = this.f37594E;
            if (interfaceC18856b4 != null) {
                interfaceC18856b4.mo66031i();
            }
        }
    }

    /* renamed from: f */
    public final void m35272f(boolean z11) {
        removeCallbacks(this.f37605P);
        this.f37604O = z11;
        if (z11) {
            AbstractC23494n.m123330f(this.f37628w);
            this.f37629x.setImageDrawable(this.f37592C);
        } else {
            AbstractC23494n.m123326b(this.f37628w);
            this.f37629x.setImageDrawable(this.f37591B);
        }
        WaveBar waveBar = this.f37628w;
        if (waveBar.f37680z != z11) {
            waveBar.f37680z = z11;
            waveBar.f37679y = System.currentTimeMillis() - ((int) (WaveBar.f37669F * 42.0f));
        }
        waveBar.invalidate();
        if (this.f37597H) {
            Boolean bool = f37589j0;
            if (bool == null || AbstractC19074t.m100204b(bool, Boolean.TRUE)) {
                if (this.f37604O) {
                    f37589j0 = Boolean.TRUE;
                    InterfaceC18856b interfaceC18856b = this.f37594E;
                    if (interfaceC18856b != null) {
                        interfaceC18856b.mo66031i();
                        return;
                    }
                    return;
                }
                if (f37589j0 == null) {
                    f37589j0 = Boolean.FALSE;
                    m35277x();
                }
            }
        }
    }

    public final InterfaceC18856b getCallback() {
        return this.f37594E;
    }

    public final ImageView getIvThumb() {
        return this.f37621p;
    }

    public final int getMode() {
        return this.f37595F;
    }

    public final boolean getOnlyShowWhenPlaying() {
        return this.f37597H;
    }

    public final long getOpenMusicAppWhenResumeIntervalInMillis() {
        return this.f37599J;
    }

    public final boolean getRightToLeftDirection() {
        return this.f37596G;
    }

    public final boolean getStayInAppWhenResume() {
        return this.f37598I;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Runnable runnable = this.f37609T;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        setElevation(100.0f);
        int i15 = this.f37595F;
        if (i15 == 0) {
            int measuredWidth = ((getMeasuredWidth() - this.f37621p.getMeasuredWidth()) - this.f37611V) - this.f37612W;
            int i16 = this.f37613a0;
            AbstractC23494n.m123327c(this.f37621p, i16, measuredWidth);
            AbstractC23494n.m123327c(this.f37622q, i16, measuredWidth);
            AbstractC23494n.m123327c(this.f37623r, i16, measuredWidth);
            ImageView imageView = this.f37590A;
            if (imageView != null) {
                AbstractC23494n.m123327c(imageView, i16, measuredWidth);
            }
            AbstractC23494n.m123327c(this.f37631z, ((this.f37621p.getMeasuredHeight() + i16) - this.f37631z.getMeasuredHeight()) + this.f37611V, ((this.f37621p.getMeasuredWidth() + measuredWidth) - this.f37631z.getMeasuredWidth()) + this.f37611V);
            AbstractC23494n.m123327c(this.f37628w, ((this.f37621p.getMeasuredHeight() - this.f37628w.getMeasuredHeight()) / 2) + i16, ((this.f37621p.getMeasuredWidth() - this.f37628w.getMeasuredWidth()) / 2) + measuredWidth);
            return;
        }
        if (i15 != 1) {
            return;
        }
        int i17 = this.f37613a0;
        int measuredHeight = ((this.f37630y.getMeasuredHeight() - this.f37627v.getMeasuredHeight()) / 2) + i17;
        if (this.f37596G) {
            int measuredWidth2 = (getMeasuredWidth() - getPaddingEnd()) - this.f37612W;
            AbstractC23494n.m123331g(this.f37631z, ((this.f37621p.getMeasuredHeight() + i17) - this.f37631z.getMeasuredHeight()) + this.f37611V, measuredWidth2);
            int i18 = measuredWidth2 - this.f37611V;
            AbstractC23494n.m123331g(this.f37621p, i17, i18);
            AbstractC23494n.m123331g(this.f37622q, i17, i18);
            AbstractC23494n.m123331g(this.f37623r, i17, i18);
            ImageView imageView2 = this.f37590A;
            if (imageView2 != null) {
                AbstractC23494n.m123331g(imageView2, i17, i18);
            }
            AbstractC23494n.m123331g(this.f37628w, ((this.f37621p.getMeasuredHeight() - this.f37628w.getMeasuredHeight()) / 2) + i17, i18 - ((this.f37621p.getMeasuredWidth() - this.f37628w.getMeasuredWidth()) / 2));
            int measuredWidth3 = i18 - (this.f37621p.getMeasuredWidth() + this.f37618f0);
            AbstractC23494n.m123331g(this.f37630y, i17, measuredWidth3);
            int measuredWidth4 = (measuredWidth3 - this.f37630y.getMeasuredWidth()) + this.f37615c0;
            int measuredHeight2 = ((this.f37630y.getMeasuredHeight() - ((this.f37626u.getMeasuredHeight() + this.f37625t.getMeasuredHeight()) + this.f37617e0)) / 2) + i17;
            AbstractC23494n.m123327c(this.f37625t, measuredHeight2, measuredWidth4);
            AbstractC23494n.m123327c(this.f37626u, this.f37625t.getMeasuredHeight() + this.f37617e0 + measuredHeight2, measuredWidth4);
            int measuredWidth5 = this.f37625t.getMeasuredWidth() + this.f37619g0 + measuredWidth4;
            AbstractC23494n.m123327c(this.f37629x, measuredHeight, measuredWidth5);
            AbstractC23494n.m123327c(this.f37627v, measuredHeight, this.f37629x.getMeasuredWidth() + measuredWidth5);
            return;
        }
        int paddingStart = getPaddingStart() + this.f37612W;
        AbstractC23494n.m123327c(this.f37621p, i17, paddingStart);
        AbstractC23494n.m123327c(this.f37622q, i17, paddingStart);
        ImageView imageView3 = this.f37590A;
        if (imageView3 != null) {
            AbstractC23494n.m123327c(imageView3, i17, paddingStart);
        }
        AbstractC23494n.m123327c(this.f37628w, ((this.f37621p.getMeasuredHeight() - this.f37628w.getMeasuredHeight()) / 2) + i17, ((this.f37621p.getMeasuredWidth() - this.f37628w.getMeasuredWidth()) / 2) + paddingStart);
        int measuredWidth6 = ((this.f37621p.getMeasuredWidth() + paddingStart) + this.f37611V) - this.f37631z.getMeasuredWidth();
        AbstractC23494n.m123327c(this.f37631z, ((this.f37621p.getMeasuredHeight() + i17) + this.f37611V) - this.f37631z.getMeasuredHeight(), measuredWidth6);
        int measuredWidth7 = this.f37621p.getMeasuredWidth() + this.f37618f0 + paddingStart;
        AbstractC23494n.m123327c(this.f37630y, i17, measuredWidth7);
        int i19 = measuredWidth7 + this.f37615c0;
        int i21 = i17 + this.f37616d0;
        AbstractC23494n.m123327c(this.f37625t, i21, i19);
        AbstractC23494n.m123327c(this.f37626u, this.f37625t.getMeasuredHeight() + this.f37617e0 + i21, i19);
        int measuredWidth8 = this.f37625t.getMeasuredWidth() + this.f37619g0 + i19;
        AbstractC23494n.m123327c(this.f37629x, measuredHeight, measuredWidth8);
        AbstractC23494n.m123327c(this.f37627v, measuredHeight, this.f37629x.getMeasuredWidth() + measuredWidth8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        int paddingEnd;
        super.onMeasure(i11, i12);
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int paddingEnd2 = size - (getPaddingEnd() + getPaddingStart());
        int paddingBottom = size2 - (getPaddingBottom() + getPaddingTop());
        if (this.f37628w.getVisibility() != 8) {
            WaveBar waveBar = this.f37628w;
            int i13 = this.f37593D;
            AbstractC23494n.m123328d(waveBar, i13, 1073741824, i13, 1073741824);
        }
        AbstractC23494n.m123328d(this.f37631z, 0, 0, 0, 0);
        AbstractC23494n.m123328d(this.f37625t, 0, 0, 0, 0);
        AbstractC23494n.m123328d(this.f37626u, 0, 0, 0, 0);
        int min = Math.min(Math.max(this.f37610U, this.f37626u.getMeasuredHeight() + this.f37625t.getMeasuredHeight() + (this.f37616d0 * 2) + this.f37617e0), paddingBottom);
        AbstractC23494n.m123328d(this.f37621p, min, 1073741824, min, 1073741824);
        AbstractC23494n.m123328d(this.f37622q, min, 1073741824, min, 1073741824);
        AbstractC23494n.m123328d(this.f37623r, this.f37621p.getMeasuredWidth(), 1073741824, this.f37621p.getMeasuredHeight(), 1073741824);
        ImageView imageView = this.f37590A;
        if (imageView != null) {
            AbstractC19074t.m100208f(imageView, "<this>");
            imageView.measure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), View.MeasureSpec.makeMeasureSpec(min, 1073741824));
        }
        AbstractC23494n.m123328d(this.f37627v, 0, 0, 0, 0);
        AbstractC23494n.m123328d(this.f37629x, 0, 0, 0, 0);
        int max = Math.max(0, (((paddingEnd2 - this.f37621p.getMeasuredWidth()) - this.f37611V) - this.f37618f0) - (this.f37612W * 2));
        int max2 = Math.max(0, ((((max - this.f37627v.getMeasuredWidth()) - this.f37629x.getMeasuredWidth()) - this.f37620h0) - this.f37619g0) - this.f37615c0);
        AbstractC23494n.m123328d(this.f37625t, max2, 1073741824, 0, 0);
        AbstractC23494n.m123328d(this.f37626u, max2, 1073741824, 0, 0);
        AbstractC23494n.m123328d(this.f37630y, max, 1073741824, min, 1073741824);
        if (this.f37595F == 0) {
            paddingEnd = (this.f37612W * 2) + this.f37621p.getMeasuredWidth() + this.f37611V;
        } else {
            paddingEnd = getPaddingEnd() + getPaddingStart() + paddingEnd2;
        }
        setMeasuredDimension(paddingEnd, getPaddingBottom() + getPaddingTop() + min + this.f37611V + this.f37613a0 + this.f37614b0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        int i11;
        AbstractC19074t.m100208f(motionEvent, "event");
        int actionMasked = motionEvent.getActionMasked();
        boolean z11 = false;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (!this.f37608S) {
                    return false;
                }
                this.f37608S = false;
                if (!m35260g(motionEvent, this.f37621p) && !m35260g(motionEvent, this.f37631z)) {
                    if (m35260g(motionEvent, this.f37625t) || m35260g(motionEvent, this.f37626u)) {
                        MediaItemInternal mediaItemInternal = this.f37600K;
                        if (mediaItemInternal == null) {
                            return true;
                        }
                        if (mediaItemInternal.f37587x == 4) {
                            Context context = getContext();
                            AbstractC19074t.m100207e(context, "context");
                            String str2 = mediaItemInternal.f37579p;
                            AbstractC19074t.m100208f(context, "context");
                            AbstractC19074t.m100208f(str2, "id");
                            Uri.Builder builder = new Uri.Builder();
                            builder.scheme("zingmp3");
                            builder.authority("liveradio");
                            builder.appendQueryParameter("id", str2);
                            Intent intent = new Intent("android.intent.action.VIEW", builder.build());
                            intent.putExtra("source_third_party", AbstractC17681d.f89680a);
                            try {
                                new C23969o(context, intent).mo12V4();
                            } catch (Exception e11) {
                                e11.printStackTrace();
                            }
                        } else {
                            Context context2 = getContext();
                            AbstractC19074t.m100207e(context2, "context");
                            AbstractC19074t.m100208f(context2, "context");
                            Uri.Builder builder2 = new Uri.Builder();
                            builder2.scheme("zingmp3");
                            builder2.authority("resume");
                            builder2.appendQueryParameter("open_player", "true");
                            Intent intent2 = new Intent("android.intent.action.VIEW", builder2.build());
                            intent2.putExtra("source_third_party", AbstractC17681d.f89680a);
                            try {
                                new C24586p(context2, intent2).mo12V4();
                            } catch (Exception e12) {
                                e12.printStackTrace();
                            }
                        }
                        return true;
                    }
                } else {
                    removeCallbacks(this.f37606Q);
                    InterfaceC18856b interfaceC18856b = this.f37594E;
                    if (interfaceC18856b != null) {
                        if (this.f37595F == 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        setMode(i11);
                        if (this.f37595F == 1) {
                            z11 = true;
                        }
                        interfaceC18856b.mo66033k(z11);
                    }
                    requestLayout();
                    C19174g c19174g = C19174g.f95302a;
                    Context context3 = getContext();
                    AbstractC19074t.m100207e(context3, "context");
                    if (this.f37595F == 1) {
                        str = "102";
                    } else {
                        str = "103";
                    }
                    boolean z12 = this.f37604O;
                    c19174g.getClass();
                    C19174g.m100625a(context3, str, z12 ? 1 : 0);
                    if (this.f37595F == 1) {
                        postDelayed(this.f37606Q, 5000L);
                    }
                    return true;
                }
            }
        } else {
            this.f37608S = false;
            if (m35260g(motionEvent, this.f37621p) || m35260g(motionEvent, this.f37631z) || m35260g(motionEvent, this.f37625t) || m35260g(motionEvent, this.f37626u)) {
                this.f37608S = true;
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: s */
    public final void m35273s() {
        C24592p0 c24592p0 = this.f37603N;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        c24592p0.m128077d(context);
    }

    public final void setCallback(InterfaceC18856b interfaceC18856b) {
        LinkedHashMap linkedHashMap;
        this.f37594E = interfaceC18856b;
        if (interfaceC18856b != null && (linkedHashMap = this.f37601L) != null) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((InterfaceC18494a) ((Map.Entry) it.next()).getValue()).mo12V4();
            }
        }
    }

    public final void setMode(int i11) {
        if (this.f37595F != i11) {
            this.f37595F = i11;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC23494n.m123330f(this.f37630y);
                    AbstractC23494n.m123330f(this.f37625t);
                    AbstractC23494n.m123330f(this.f37626u);
                    AbstractC23494n.m123330f(this.f37627v);
                    AbstractC23494n.m123330f(this.f37629x);
                }
            } else {
                AbstractC23494n.m123326b(this.f37630y);
                AbstractC23494n.m123326b(this.f37625t);
                AbstractC23494n.m123326b(this.f37626u);
                AbstractC23494n.m123326b(this.f37627v);
                AbstractC23494n.m123326b(this.f37629x);
            }
            requestLayout();
        }
    }

    public final void setOnlyShowWhenPlaying(boolean z11) {
        this.f37597H = z11;
    }

    public final void setOpenMusicAppWhenResumeIntervalInMillis(long j11) {
        this.f37599J = j11;
    }

    public final void setRightToLeftDirection(boolean z11) {
        if (this.f37596G != z11) {
            this.f37596G = z11;
            requestLayout();
        }
    }

    public final void setStayInAppWhenResume(boolean z11) {
        this.f37598I = z11;
    }

    /* renamed from: u */
    public final void m35274u() {
        C19174g c19174g = C19174g.f95302a;
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        boolean z11 = this.f37604O;
        c19174g.getClass();
        C19174g.m100625a(context, "101", z11 ? 1 : 0);
    }

    /* renamed from: v */
    public final void m35275v() {
        this.f37603N.f118359i = false;
    }

    /* renamed from: w */
    public final void m35276w() {
        if (this.f37607R && !AbstractC19074t.m100204b(f37589j0, Boolean.FALSE)) {
            this.f37607R = false;
            removeCallbacks(this.f37605P);
            Runnable runnable = new Runnable() { // from class: ib.a
                @Override // java.lang.Runnable
                public final void run() {
                    PlaybarView.m35270r(PlaybarView.this);
                }
            };
            this.f37605P = runnable;
            postDelayed(runnable, 5000L);
            if (this.f37603N.f118359i) {
                MediaItemInternal mediaItemInternal = AbstractC17681d.f89681b;
                if (mediaItemInternal != null) {
                    this.f37600K = mediaItemInternal;
                    m35271b(mediaItemInternal);
                    if (this.f37595F == 1 && this.f37604O) {
                        postDelayed(this.f37606Q, 5000L);
                    }
                }
                m35272f(AbstractC17681d.f89682c);
            }
            C24592p0 c24592p0 = this.f37603N;
            int hashCode = hashCode();
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c24592p0.m128076c(hashCode, context, this.f37602M);
        }
    }

    /* renamed from: x */
    public final void m35277x() {
        if (this.f37607R) {
            return;
        }
        this.f37607R = true;
        C24592p0 c24592p0 = this.f37603N;
        int hashCode = hashCode();
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        c24592p0.m128075b(hashCode, context);
        removeCallbacks(this.f37605P);
        removeCallbacks(this.f37606Q);
    }

    public /* synthetic */ PlaybarView(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaybarView(final Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f37596G = true;
        this.f37599J = -1L;
        this.f37602M = new C28680w(context, this);
        C24592p0 c24592p0 = C24592p0.f118350o;
        this.f37603N = AbstractC17683d0.m93669a();
        this.f37604O = AbstractC2471b.m12485b();
        this.f37606Q = new Runnable() { // from class: ib.b
            @Override // java.lang.Runnable
            public final void run() {
                PlaybarView.m35257c(PlaybarView.this);
            }
        };
        this.f37607R = true;
        this.f37610U = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_default_player_layout_height);
        int m123329e = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_spacing_small);
        int m123329e2 = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_spacing_pretty_small);
        this.f37611V = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_ic_logo_margin);
        this.f37612W = AbstractC23494n.m123325a(this, 16);
        this.f37613a0 = AbstractC23494n.m123325a(this, 8);
        this.f37614b0 = AbstractC23494n.m123325a(this, 24);
        this.f37615c0 = m123329e2;
        this.f37616d0 = m123329e;
        this.f37617e0 = AbstractC23494n.m123325a(this, 2);
        this.f37618f0 = m123329e;
        this.f37619g0 = AbstractC23494n.m123325a(this, 2);
        this.f37620h0 = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_spacing_small);
        View.inflate(context, AbstractC18861g.zingmp3sdk_layout_player, this);
        AbstractC23494n.m123326b(this);
        View findViewById = findViewById(AbstractC18860f.ivThumb);
        AbstractC19074t.m100207e(findViewById, "findViewById(R.id.ivThumb)");
        ImageView imageView = (ImageView) findViewById;
        this.f37621p = imageView;
        View findViewById2 = findViewById(AbstractC18860f.thumbOverlay);
        AbstractC19074t.m100207e(findViewById2, "findViewById(R.id.thumbOverlay)");
        this.f37622q = findViewById2;
        View findViewById3 = findViewById(AbstractC18860f.ivBg);
        AbstractC19074t.m100207e(findViewById3, "findViewById(R.id.ivBg)");
        this.f37623r = findViewById3;
        View findViewById4 = findViewById(AbstractC18860f.vsDefault);
        AbstractC19074t.m100207e(findViewById4, "findViewById(R.id.vsDefault)");
        this.f37624s = (ViewStub) findViewById4;
        View findViewById5 = findViewById(AbstractC18860f.tvTitle);
        AbstractC19074t.m100207e(findViewById5, "findViewById(R.id.tvTitle)");
        TextView textView = (TextView) findViewById5;
        this.f37625t = textView;
        View findViewById6 = findViewById(AbstractC18860f.tvArtist);
        AbstractC19074t.m100207e(findViewById6, "findViewById(R.id.tvArtist)");
        TextView textView2 = (TextView) findViewById6;
        this.f37626u = textView2;
        View findViewById7 = findViewById(AbstractC18860f.ivMore);
        AbstractC19074t.m100207e(findViewById7, "findViewById(R.id.ivMore)");
        ImageView imageView2 = (ImageView) findViewById7;
        this.f37627v = imageView2;
        View findViewById8 = findViewById(AbstractC18860f.waveBar);
        AbstractC19074t.m100207e(findViewById8, "findViewById(R.id.waveBar)");
        WaveBar waveBar = (WaveBar) findViewById8;
        this.f37628w = waveBar;
        View findViewById9 = findViewById(AbstractC18860f.ivPlay2);
        AbstractC19074t.m100207e(findViewById9, "findViewById(R.id.ivPlay2)");
        ImageView imageView3 = (ImageView) findViewById9;
        this.f37629x = imageView3;
        View findViewById10 = findViewById(AbstractC18860f.bgView);
        AbstractC19074t.m100207e(findViewById10, "findViewById(R.id.bgView)");
        this.f37630y = findViewById10;
        View findViewById11 = findViewById(AbstractC18860f.ivLogo);
        AbstractC19074t.m100207e(findViewById11, "findViewById(R.id.ivLogo)");
        this.f37631z = (ImageView) findViewById11;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC18863i.PlaybarView);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr… R.styleable.PlaybarView)");
        setMode(obtainStyledAttributes.getInt(AbstractC18863i.PlaybarView_zingmp3sdk_pb_layout_mode, 0) == 1 ? 1 : 0);
        setRightToLeftDirection(obtainStyledAttributes.getBoolean(AbstractC18863i.PlaybarView_zingmp3sdk_pb_right_to_left_dir, true));
        this.f37593D = obtainStyledAttributes.getDimensionPixelSize(AbstractC18863i.PlaybarView_zingmp3sdk_pb_wavebar_size, AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_default_wavebar_size));
        int color = obtainStyledAttributes.getColor(AbstractC18863i.PlaybarView_zingmp3sdk_pb_text_title, getResources().getColor(AbstractC18857c.zingmp3sdk_textTitle));
        int color2 = obtainStyledAttributes.getColor(AbstractC18863i.PlaybarView_zingmp3sdk_pb_text_subtitle, getResources().getColor(AbstractC18857c.zingmp3sdk_textSubTitle));
        textView.setTextColor(color);
        textView2.setTextColor(color2);
        Drawable drawable = obtainStyledAttributes.getDrawable(AbstractC18863i.PlaybarView_zingmp3sdk_pb_bg_player_drawable);
        findViewById10.setBackground(drawable == null ? getResources().getDrawable(AbstractC18859e.zingmp3sdk_bg_player_view) : drawable);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(AbstractC18863i.PlaybarView_zingmp3sdk_pb_ic_more_drawable);
        imageView2.setImageDrawable(drawable2 == null ? getResources().getDrawable(AbstractC18859e.zingmp3sdk_ic_more) : drawable2);
        Drawable drawable3 = obtainStyledAttributes.getDrawable(AbstractC18863i.PlaybarView_zingmp3sdk_pb_ic_play_drawable);
        drawable3 = drawable3 == null ? getResources().getDrawable(AbstractC18859e.zingmp3sdk_ic_play_small) : drawable3;
        this.f37591B = drawable3;
        Drawable drawable4 = obtainStyledAttributes.getDrawable(AbstractC18863i.PlaybarView_zingmp3sdk_pb_ic_pause_drawable);
        this.f37592C = drawable4 == null ? getResources().getDrawable(AbstractC18859e.zingmp3sdk_ic_pause_small) : drawable4;
        imageView3.setImageDrawable(drawable3);
        int color3 = obtainStyledAttributes.getColor(AbstractC18863i.PlaybarView_zingmp3sdk_pb_default_thumb_bg_color, getResources().getColor(AbstractC18857c.zingmp3sdk_defaultThumbBg));
        imageView.setBackgroundColor(color3);
        findViewById3.setBackgroundColor(color3);
        obtainStyledAttributes.recycle();
        float m123329e3 = AbstractC23494n.m123329e(this, AbstractC18858d.zingmp3sdk_player_radius);
        m35256a(imageView, m123329e3);
        m35256a(findViewById2, m123329e3);
        m35256a(findViewById3, m123329e3);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: ib.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaybarView.m35259e(PlaybarView.this, view);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() { // from class: ib.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaybarView.m35258d(PlaybarView.this, context, view);
            }
        });
        AbstractC23494n.m123326b(waveBar);
        textView.setSelected(true);
        String packageName = context.getPackageName();
        AbstractC19074t.m100207e(packageName, "context.packageName");
        AbstractC2471b.m12484a(packageName);
    }
}
