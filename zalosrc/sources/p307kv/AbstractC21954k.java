package p307kv;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.animation.AccelerateInterpolator;
import android.webkit.URLUtil;
import android.webkit.WebView;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import ho0.AbstractC20110a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import org.json.JSONObject;
import p140ev.C18613b;
import p189gv.C19609h;
import p307kv.AbstractC21954k;

/* renamed from: kv.k */
/* loaded from: classes4.dex */
public abstract class AbstractC21954k {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private static final Pattern f108062a;

    /* renamed from: kv.k$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: kv.k$a$a */
        /* loaded from: classes4.dex */
        public static final class C32875a implements Animator.AnimatorListener {

            /* renamed from: p */
            final /* synthetic */ InterfaceC18494a f108063p;

            public C32875a(InterfaceC18494a interfaceC18494a) {
                this.f108063p = interfaceC18494a;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
                InterfaceC18494a interfaceC18494a = this.f108063p;
                if (interfaceC18494a != null) {
                    interfaceC18494a.mo12V4();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                AbstractC19074t.m100208f(animator, "animator");
            }
        }

        /* renamed from: kv.k$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ InterfaceC18494a f108064p;

            b(InterfaceC18494a interfaceC18494a) {
                this.f108064p = interfaceC18494a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                InterfaceC18494a interfaceC18494a = this.f108064p;
                if (interfaceC18494a != null) {
                    interfaceC18494a.mo12V4();
                }
            }
        }

        /* renamed from: kv.k$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AnimatorListenerAdapter {

            /* renamed from: p */
            final /* synthetic */ InterfaceC18494a f108065p;

            c(InterfaceC18494a interfaceC18494a) {
                this.f108065p = interfaceC18494a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                AbstractC19074t.m100208f(animator, "animation");
                InterfaceC18494a interfaceC18494a = this.f108065p;
                if (interfaceC18494a != null) {
                    interfaceC18494a.mo12V4();
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: A */
        public static final void m114591A(InterfaceC18505l interfaceC18505l, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(valueAnimator, "value");
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(valueAnimator);
            }
        }

        /* renamed from: C */
        public static /* synthetic */ void m114592C(a aVar, View view, float f11, long j11, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
            InterfaceC18494a interfaceC18494a2;
            InterfaceC18505l interfaceC18505l2;
            if ((i11 & 4) != 0) {
                j11 = 300;
            }
            long j12 = j11;
            if ((i11 & 8) != 0) {
                interfaceC18494a2 = null;
            } else {
                interfaceC18494a2 = interfaceC18494a;
            }
            if ((i11 & 16) != 0) {
                interfaceC18505l2 = null;
            } else {
                interfaceC18505l2 = interfaceC18505l;
            }
            aVar.m114605B(view, f11, j12, interfaceC18494a2, interfaceC18505l2);
        }

        /* renamed from: D */
        public static final void m114593D(View view, float f11, float f12, InterfaceC18505l interfaceC18505l, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(view, "$view");
            AbstractC19074t.m100208f(valueAnimator, "mValue");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            view.setTranslationY(f11 + (f12 * floatValue));
            if (interfaceC18505l != null) {
                interfaceC18505l.mo205i9(Float.valueOf(floatValue));
            }
        }

        /* renamed from: F */
        public static final void m114594F(View view, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11, ValueAnimator valueAnimator) {
            AbstractC19074t.m100208f(view, "$animView");
            AbstractC19074t.m100208f(valueAnimator, "mValue");
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            float f19 = 1 - floatValue;
            layoutParams.width = (int) ((f11 * floatValue) + (f12 * f19));
            layoutParams.height = (int) ((f13 * floatValue) + (f14 * f19));
            view.setLayoutParams(layoutParams);
            view.setX((f15 * floatValue) + (f16 * f19));
            view.setY((f17 * floatValue) + (f18 * f19));
            if (z11) {
                floatValue = f19;
            }
            view.setAlpha(floatValue);
        }

        /* renamed from: H */
        public static final void m114595H(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }

        /* renamed from: k */
        public static /* synthetic */ String m114600k(a aVar, String str, JSONObject jSONObject, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = null;
            }
            return aVar.m114618j(str, jSONObject);
        }

        /* renamed from: n */
        private final PackageInfo m114601n() {
            return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
        }

        /* renamed from: p */
        private final PackageInfo m114602p(Context context) {
            String str;
            try {
                if (Build.VERSION.SDK_INT <= 23) {
                    Object invoke = Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
                    AbstractC19074t.m100206d(invoke, "null cannot be cast to non-null type kotlin.String");
                    str = (String) invoke;
                } else {
                    Object invoke2 = Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]);
                    AbstractC19074t.m100206d(invoke2, "null cannot be cast to non-null type kotlin.String");
                    str = (String) invoke2;
                }
                return context.getPackageManager().getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: w */
        private final String m114603w(File file, String str) {
            String str2;
            boolean z11;
            if (str != null) {
                String[] strArr = (String[]) new C24329j("/").m127021i(str, 0).toArray(new String[0]);
                if (strArr.length == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    str2 = strArr[strArr.length - 1];
                    if (!AbstractC19074t.m100204b("", str2) || AbstractC19074t.m100204b("*", str2)) {
                        str2 = "png";
                    }
                    C19067n0 c19067n0 = C19067n0.f94947a;
                    String format = String.format("%s%s%s.%s", Arrays.copyOf(new Object[]{file.getParent(), File.separator, Long.valueOf(new Date().getTime()), str2}, 4));
                    AbstractC19074t.m100207e(format, "format(...)");
                    return format;
                }
            }
            str2 = "";
            if (!AbstractC19074t.m100204b("", str2)) {
            }
            str2 = "png";
            C19067n0 c19067n02 = C19067n0.f94947a;
            String format2 = String.format("%s%s%s.%s", Arrays.copyOf(new Object[]{file.getParent(), File.separator, Long.valueOf(new Date().getTime()), str2}, 4));
            AbstractC19074t.m100207e(format2, "format(...)");
            return format2;
        }

        /* renamed from: z */
        public static /* synthetic */ Animator m114604z(a aVar, View view, float f11, long j11, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l, int i11, Object obj) {
            InterfaceC18494a interfaceC18494a2;
            InterfaceC18505l interfaceC18505l2;
            if ((i11 & 4) != 0) {
                j11 = 300;
            }
            long j12 = j11;
            if ((i11 & 8) != 0) {
                interfaceC18494a2 = null;
            } else {
                interfaceC18494a2 = interfaceC18494a;
            }
            if ((i11 & 16) != 0) {
                interfaceC18505l2 = null;
            } else {
                interfaceC18505l2 = interfaceC18505l;
            }
            return aVar.m114629y(view, f11, j12, interfaceC18494a2, interfaceC18505l2);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
            jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: kv.h.<init>(android.view.View, float, float, en0.l):void, class status: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:289)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
            	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:172)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:64)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(Unknown Source)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
            	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
            */
        /* renamed from: B */
        public final void m114605B(android.view.View r4, float r5, long r6, en0.InterfaceC18494a r8, en0.InterfaceC18505l r9) {
            /*
                r3 = this;
                java.lang.String r0 = "view"
                fn0.AbstractC19074t.m100208f(r4, r0)
                float r0 = r4.getTranslationY()
                r1 = 2
                float[] r1 = new float[r1]
                r1 = {x002a: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
                kv.h r2 = new kv.h
                r2.<init>()
                r1.addUpdateListener(r2)
                kv.k$a$b r4 = new kv.k$a$b
                r4.<init>(r8)
                r1.addListener(r4)
                r1.setDuration(r6)
                r1.start()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p307kv.AbstractC21954k.a.m114605B(android.view.View, float, long, en0.a, en0.l):void");
        }

        /* renamed from: E */
        public final void m114606E(View view, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, boolean z11, InterfaceC18494a interfaceC18494a) {
            AbstractC19074t.m100208f(view, "animView");
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kv.i

                /* renamed from: p */
                public final /* synthetic */ View f108051p;

                /* renamed from: q */
                public final /* synthetic */ float f108052q;

                /* renamed from: r */
                public final /* synthetic */ float f108053r;

                /* renamed from: s */
                public final /* synthetic */ float f108054s;

                /* renamed from: t */
                public final /* synthetic */ float f108055t;

                /* renamed from: u */
                public final /* synthetic */ float f108056u;

                /* renamed from: v */
                public final /* synthetic */ float f108057v;

                /* renamed from: w */
                public final /* synthetic */ float f108058w;

                /* renamed from: x */
                public final /* synthetic */ float f108059x;

                /* renamed from: y */
                public final /* synthetic */ boolean f108060y;

                public /* synthetic */ C21952i(View view2, float f112, float f132, float f122, float f142, float f152, float f172, float f162, float f182, boolean z112) {
                    r1 = view2;
                    r2 = f112;
                    r3 = f132;
                    r4 = f122;
                    r5 = f142;
                    r6 = f152;
                    r7 = f172;
                    r8 = f162;
                    r9 = f182;
                    r10 = z112;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC21954k.a.m114594F(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, valueAnimator);
                }
            });
            ofFloat.addListener(new c(interfaceC18494a));
            ofFloat.setDuration(500L);
            ofFloat.start();
        }

        /* renamed from: G */
        public final void m114607G(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: kv.j

                /* renamed from: p */
                public final /* synthetic */ Runnable f108061p;

                public /* synthetic */ RunnableC21953j(Runnable runnable2) {
                    r1 = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC21954k.a.m114595H(r1);
                }
            });
        }

        /* renamed from: I */
        public final String m114608I(String str, File file) {
            AbstractC19074t.m100208f(str, "base64ImageData");
            AbstractC19074t.m100208f(file, "outputFile");
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                String[] strArr = (String[]) new C24329j(",").m127021i(str, 0).toArray(new String[0]);
                byte[] decode = Base64.decode(strArr[strArr.length - 1], 0);
                BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                if (options.outWidth <= 0 || options.outHeight <= 0) {
                    return null;
                }
                String m114603w = m114603w(file, options.outMimeType);
                FileOutputStream fileOutputStream = new FileOutputStream(m114603w);
                fileOutputStream.write(decode);
                fileOutputStream.flush();
                fileOutputStream.close();
                return m114603w;
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }

        /* renamed from: J */
        public final Bitmap m114609J(View view) {
            AbstractC19074t.m100208f(view, "contentView");
            int width = view.getWidth();
            int height = view.getHeight();
            if (width > 0 && height > 0) {
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                AbstractC19074t.m100207e(createBitmap, "createBitmap(...)");
                view.draw(new Canvas(createBitmap));
                return createBitmap;
            }
            return null;
        }

        /* renamed from: K */
        public final void m114610K(Activity activity, boolean z11) {
            int i11;
            WindowInsetsController insetsController;
            int navigationBars;
            AbstractC19074t.m100208f(activity, "activity");
            Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 4096);
            if (Build.VERSION.SDK_INT >= 30) {
                insetsController = window.getInsetsController();
                if (insetsController != null) {
                    insetsController.setSystemBarsBehavior(2);
                    navigationBars = WindowInsets.Type.navigationBars();
                    if (z11) {
                        insetsController.show(navigationBars);
                        return;
                    } else {
                        insetsController.hide(navigationBars);
                        return;
                    }
                }
                return;
            }
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            if (z11) {
                i11 = systemUiVisibility & (-3);
            } else {
                i11 = systemUiVisibility | 2;
            }
            window.getDecorView().setSystemUiVisibility(i11);
        }

        /* renamed from: L */
        public final void m114611L(Activity activity, boolean z11, boolean z12) {
            int statusBars;
            WindowInsetsController insetsController;
            WindowInsetsController insetsController2;
            AbstractC19074t.m100208f(activity, "activity");
            Window window = activity.getWindow();
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 4096);
            if (Build.VERSION.SDK_INT >= 30) {
                if (!z12) {
                    window.setDecorFitsSystemWindows(false);
                }
                statusBars = WindowInsets.Type.statusBars();
                if (z11) {
                    insetsController2 = window.getInsetsController();
                    if (insetsController2 != null) {
                        insetsController2.show(statusBars);
                        return;
                    }
                    return;
                }
                insetsController = window.getInsetsController();
                if (insetsController != null) {
                    insetsController.hide(statusBars);
                    return;
                }
                return;
            }
            if (z11) {
                window.clearFlags(1024);
            } else {
                window.addFlags(1024);
            }
        }

        /* renamed from: M */
        public final String m114612M(String str) {
            int m127172a0;
            String m127114D;
            int i11;
            boolean z11;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            int length = str.length() - 1;
            boolean z12 = false;
            int i12 = 0;
            boolean z13 = false;
            while (i12 <= length) {
                if (!z13) {
                    i11 = i12;
                } else {
                    i11 = length;
                }
                if (AbstractC19074t.m100209g(str.charAt(i11), 32) <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z13) {
                    if (!z11) {
                        z13 = true;
                    } else {
                        i12++;
                    }
                } else {
                    if (!z11) {
                        break;
                    }
                    length--;
                }
            }
            String obj = str.subSequence(i12, length + 1).toString();
            m127172a0 = AbstractC24342w.m127172a0(obj, ' ', 0, false, 6, null);
            if (m127172a0 != -1) {
                z12 = true;
            }
            Matcher matcher = m114616h().matcher(obj);
            if (matcher == null) {
                return null;
            }
            if (matcher.matches()) {
                String group = matcher.group(1);
                if (group == null) {
                    return null;
                }
                Locale locale = Locale.getDefault();
                AbstractC19074t.m100207e(locale, "getDefault(...)");
                String lowerCase = group.toLowerCase(locale);
                AbstractC19074t.m100207e(lowerCase, "toLowerCase(...)");
                if (!AbstractC19074t.m100204b(lowerCase, group)) {
                    obj = lowerCase + matcher.group(2);
                }
                String str2 = obj;
                if (z12 && Patterns.WEB_URL.matcher(str2).matches()) {
                    m127114D = AbstractC24341v.m127114D(str2, " ", "%20", false, 4, null);
                    return m127114D;
                }
                return str2;
            }
            if (z12 || !Patterns.WEB_URL.matcher(obj).matches()) {
                return null;
            }
            return URLUtil.guessUrl(obj);
        }

        /* renamed from: e */
        public final float m114613e(int i11, Context context) {
            int i12;
            AbstractC19074t.m100208f(context, "context");
            try {
                i12 = i11 * (context.getResources().getDisplayMetrics().densityDpi / 160);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                i12 = 0;
            }
            return i12;
        }

        /* renamed from: f */
        public final File m114614f() {
            return File.createTempFile("JPEG_" + new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date()) + "_", ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
        }

        /* renamed from: g */
        public final String m114615g(int i11, b bVar, String str) {
            JSONObject jSONObject;
            String jSONObject2;
            AbstractC19074t.m100208f(bVar, "sourceString");
            AbstractC19074t.m100208f(str, "extraParam");
            try {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (Exception unused) {
                        jSONObject = new JSONObject();
                    }
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if (i11 == C18613b.f93600s.m98348a()) {
                    if (bVar.m114632c() > 0) {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 1);
                        jSONObject.put("id", bVar.m114632c());
                    } else if (bVar.m114633d() > 0) {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 2);
                        jSONObject.put("id", bVar.m114633d());
                    } else if (bVar.m114631b() == 0) {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 3);
                        jSONObject.put("id", bVar.m114631b());
                    }
                    jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100205c(jSONObject2);
                } else if (i11 == C18613b.f93601t.m98348a()) {
                    if (bVar.m114630a() > 0) {
                        jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, 0);
                        jSONObject.put("id", bVar.m114630a());
                    }
                    jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100205c(jSONObject2);
                } else {
                    if (TextUtils.isEmpty(str)) {
                        return "";
                    }
                    jSONObject2 = jSONObject.toString();
                    AbstractC19074t.m100205c(jSONObject2);
                }
                return jSONObject2;
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }

        /* renamed from: h */
        public final Pattern m114616h() {
            return AbstractC21954k.f108062a;
        }

        /* renamed from: i */
        public final String m114617i(C19609h c19609h, String str) {
            String m102616j;
            if (c19609h == null || (m102616j = c19609h.m102616j()) == null) {
                return m114620m(str);
            }
            return m102616j;
        }

        /* renamed from: j */
        public final String m114618j(String str, JSONObject jSONObject) {
            AbstractC19074t.m100208f(jSONObject, "data");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error_code", 0);
            jSONObject2.put("error_message", "successfull");
            jSONObject2.putOpt("data", jSONObject);
            if (str != null) {
                jSONObject2.put("action", str);
            }
            String jSONObject3 = jSONObject2.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            return jSONObject3;
        }

        /* renamed from: l */
        public final PackageInfo m114619l(Context context) {
            PackageInfo currentWebViewPackage;
            AbstractC19074t.m100208f(context, "context");
            if (Build.VERSION.SDK_INT >= 26) {
                currentWebViewPackage = WebView.getCurrentWebViewPackage();
                return currentWebViewPackage;
            }
            try {
                PackageInfo m114601n = m114601n();
                if (m114601n != null) {
                    return m114601n;
                }
                return m114602p(context);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }

        /* renamed from: m */
        public final String m114620m(String str) {
            boolean m127120J;
            boolean m127120J2;
            boolean m127120J3;
            if (str != null) {
                m127120J2 = AbstractC24341v.m127120J(str, "http://", false, 2, null);
                if (!m127120J2) {
                    m127120J3 = AbstractC24341v.m127120J(str, "https://", false, 2, null);
                    if (!m127120J3) {
                        return null;
                    }
                }
            }
            try {
                URI uri = new URI(str);
                if (!TextUtils.isEmpty(uri.getHost())) {
                    String host = uri.getHost();
                    AbstractC19074t.m100205c(host);
                    m127120J = AbstractC24341v.m127120J(host, "www.", false, 2, null);
                    if (m127120J) {
                        String substring = host.substring(4);
                        AbstractC19074t.m100207e(substring, "substring(...)");
                        return substring;
                    }
                    return host;
                }
                return "";
            } catch (Exception e11) {
                e11.printStackTrace();
                return "";
            }
        }

        /* renamed from: o */
        public final String m114621o(C19609h c19609h) {
            String str;
            JSONObject m102614h;
            if (c19609h != null) {
                str = c19609h.m102620n();
            } else {
                str = null;
            }
            if (c19609h != null && (m102614h = c19609h.m102614h()) != null && m102614h.has("shareUrl")) {
                str = c19609h.m102614h().getString("shareUrl");
            }
            if (str == null) {
                return "";
            }
            return str;
        }

        /* renamed from: q */
        public final Serializable m114622q(Bundle bundle, String str, Class cls) {
            Serializable serializable;
            AbstractC19074t.m100208f(bundle, "arguments");
            AbstractC19074t.m100208f(str, "name");
            AbstractC19074t.m100208f(cls, "clazz");
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    serializable = bundle.getSerializable(str, cls);
                } else {
                    serializable = bundle.getSerializable(str);
                }
                return serializable;
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: r */
        public final long m114623r() {
            return SystemClock.elapsedRealtime();
        }

        /* renamed from: s */
        public final boolean m114624s(Integer num) {
            if (num == null || 1 - ((((Color.red(num.intValue()) * 0.299d) + (Color.green(num.intValue()) * 0.587d)) + (Color.blue(num.intValue()) * 0.114d)) / 255) < 0.5d) {
                return false;
            }
            return true;
        }

        /* renamed from: t */
        public final boolean m114625t(String str) {
            boolean m127120J;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            m127120J = AbstractC24341v.m127120J(str, "https://h5.zdn.vn/", false, 2, null);
            return m127120J;
        }

        /* renamed from: u */
        public final String m114626u(String str) {
            if (AbstractC19074t.m100204b(str, "android.permission.RECORD_AUDIO")) {
                return "android.webkit.resource.AUDIO_CAPTURE";
            }
            if (AbstractC19074t.m100204b(str, "android.permission.CAMERA")) {
                return "android.webkit.resource.VIDEO_CAPTURE";
            }
            return null;
        }

        /* renamed from: v */
        public final void m114627v(Activity activity, Intent intent) {
            AbstractC19074t.m100208f(activity, "activity");
            AbstractC19074t.m100208f(intent, "intent");
            intent.addFlags(65536);
            intent.addFlags(131072);
            intent.setAction("MiniApp.Open.Zalo");
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }

        /* renamed from: x */
        public final String m114628x(String str) {
            boolean m127120J;
            String m127189r0;
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            m127120J = AbstractC24341v.m127120J(str, "https://", false, 2, null);
            if (m127120J) {
                m127189r0 = AbstractC24342w.m127189r0(str, "https://");
                return m127189r0;
            }
            return str;
        }

        /* renamed from: y */
        public final Animator m114629y(View view, float f11, long j11, InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(view, "view");
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", f11);
            AbstractC19074t.m100205c(ofFloat);
            ofFloat.addListener(new C32875a(interfaceC18494a));
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kv.g
                public /* synthetic */ C21950g() {
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC21954k.a.m114591A(InterfaceC18505l.this, valueAnimator);
                }
            });
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.setDuration(j11);
            ofFloat.start();
            AbstractC19074t.m100207e(ofFloat, "apply(...)");
            return ofFloat;
        }
    }

    /* renamed from: kv.k$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private int f108066a;

        /* renamed from: b */
        private long f108067b;

        /* renamed from: c */
        private long f108068c;

        /* renamed from: d */
        private int f108069d;

        public b(int i11, long j11, long j12, int i12) {
            this.f108066a = i11;
            this.f108067b = j11;
            this.f108068c = j12;
            this.f108069d = i12;
        }

        /* renamed from: a */
        public final int m114630a() {
            return this.f108066a;
        }

        /* renamed from: b */
        public final int m114631b() {
            return this.f108069d;
        }

        /* renamed from: c */
        public final long m114632c() {
            return this.f108068c;
        }

        /* renamed from: d */
        public final long m114633d() {
            return this.f108067b;
        }
    }

    static {
        Pattern compile = Pattern.compile("(?i)((?:http|https|file)://|(?:inline|data|about|javascript):)(.*)");
        AbstractC19074t.m100207e(compile, "compile(...)");
        f108062a = compile;
    }
}
