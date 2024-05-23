package me0;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.text.TextPaint;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.client.AESUtils;
import com.zing.zalo.p077ui.ExternalCallSplashActivity;
import com.zing.zalo.p077ui.ZaloBubbleActivity;
import com.zing.zalo.p077ui.widget.C13704p1;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalocore.CoreUtility;
import gm0.AbstractC19509c;
import gu.AbstractC19601a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kn.AbstractC21777d;
import mm0.AbstractC23352g;
import p133ek.AbstractC18458a;
import p161fg.C18922m;
import p209hg.C20052c;
import p542ub.InterfaceC27218a;
import u00.AbstractC26927i;
import u00.AbstractC26934p;
import u00.AbstractC26935q;
import vg.AbstractC28033c6;
import vg.AbstractC28113k6;

/* renamed from: me0.p7 */
/* loaded from: classes4.dex */
public abstract class AbstractC23178p7 {

    /* renamed from: a */
    private static TextPaint f112382a;

    /* renamed from: b */
    private static Paint f112383b;

    /* renamed from: a */
    public static void m119402a(InterfaceC27218a interfaceC27218a, int i11, String str, String str2, Bitmap bitmap) {
        ShortcutInfo.Builder activity;
        Icon createWithBitmap;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        ShortcutInfo.Builder intent;
        ShortcutInfo build;
        if (interfaceC27218a == null) {
            return;
        }
        try {
            Context context = interfaceC27218a.getContext();
            Intent intent2 = new Intent(context, (Class<?>) ExternalCallSplashActivity.class);
            intent2.setAction("com.zing.zalo.intent.action.OPEN_URL");
            if (i11 > 0) {
                intent2.putExtra("open_url_featureId", i11);
            }
            intent2.setData(Uri.parse(str2));
            intent2.putExtra("intent_sig", AbstractC23224t9.m119686a(intent2));
            intent2.addFlags(268435456);
            intent2.addFlags(67108864);
            intent2.putExtra("EXTRA_OPEN_FROM_SHORTCUT", true);
            if (Build.VERSION.SDK_INT < 26) {
                Intent intent3 = new Intent();
                intent3.putExtra("android.intent.extra.shortcut.INTENT", intent2);
                intent3.putExtra("android.intent.extra.shortcut.NAME", str);
                intent3.putExtra("android.intent.extra.shortcut.ICON", bitmap);
                intent3.putExtra("duplicate", false);
                intent3.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                context.sendBroadcast(intent3);
                return;
            }
            AbstractC28113k6.m141600a();
            activity = AbstractC28033c6.m141471a(context, AbstractC23352g.m122788d(str2)).setActivity(new ComponentName(context, (Class<?>) ExternalCallSplashActivity.class));
            createWithBitmap = Icon.createWithBitmap(bitmap);
            icon = activity.setIcon(createWithBitmap);
            shortLabel = icon.setShortLabel(str);
            longLabel = shortLabel.setLongLabel(str);
            intent = longLabel.setIntent(intent2);
            build = intent.build();
            int m119404c = m119404c(interfaceC27218a.getContext(), build);
            if (m119404c != -1) {
                if (m119404c != 0) {
                    if (m119404c == 1) {
                        ToastUtils.showMess(interfaceC27218a.getString(AbstractC8020f0.str_shortcut_mini_chat_create_success));
                        return;
                    }
                    return;
                }
                ToastUtils.m89266n(AbstractC8020f0.str_shortcut_exists, new Object[0]);
                return;
            }
            ToastUtils.showMess(interfaceC27218a.getString(AbstractC8020f0.str_shortcut_mini_chat_create_fail));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m119403b(InterfaceC27218a interfaceC27218a) {
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_calendar_titlebar);
        try {
            try {
                int m118742r = AbstractC23136l9.m118742r(60.0f);
                int m118742r2 = AbstractC23136l9.m118742r(3.0f);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                Bitmap createBitmap = Bitmap.createBitmap(m118742r, m118742r, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Bitmap decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.calendar_shortcut);
                int i11 = m118742r - m118742r2;
                canvas.drawBitmap(decodeResource, (Rect) null, new Rect(m118742r2, m118742r2, i11, i11), paint);
                if (Build.VERSION.SDK_INT < 26) {
                    Bitmap decodeResource2 = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.logozalo_headchat3);
                    canvas.drawBitmap(decodeResource2, (Rect) null, new Rect(m118742r - decodeResource2.getWidth(), m118742r - decodeResource2.getHeight(), m118742r, m118742r), paint);
                    decodeResource2.recycle();
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(CoreUtility.getAppContext(), "com.zing.zalo.ui.IntentHandlerActivityAlias"));
                    intent.setAction("com.zing.zalo.action.SHORTCUT_CALENDAR");
                    intent.putExtra("intent_sig", AbstractC23224t9.m119686a(intent));
                    intent.addFlags(268435456);
                    intent.addFlags(67108864);
                    Intent intent2 = new Intent();
                    intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                    intent2.putExtra("android.intent.extra.shortcut.NAME", m118743r0);
                    intent2.putExtra("android.intent.extra.shortcut.ICON", createBitmap);
                    intent2.putExtra("duplicate", false);
                    intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                    CoreUtility.getAppContext().sendBroadcast(intent2);
                    if (interfaceC27218a != null) {
                        ToastUtils.showMess(interfaceC27218a.getString(AbstractC8020f0.str_shortcut_mini_chat_create_success));
                        if (!(interfaceC27218a instanceof ZaloActivity) && (interfaceC27218a instanceof C20052c)) {
                            C18922m.m99141t().m99143L();
                        }
                        Intent intent3 = new Intent("android.intent.action.MAIN");
                        intent3.addCategory("android.intent.category.HOME");
                        intent3.setFlags(268435456);
                        interfaceC27218a.startActivity(intent3);
                    }
                } else if (interfaceC27218a != null && interfaceC27218a.getContext() != null) {
                    int m119404c = m119404c(interfaceC27218a.getContext(), m119412k(interfaceC27218a.getContext(), "ZaloCalendar", createBitmap, m118743r0, m119409h(interfaceC27218a.getContext())));
                    if (m119404c == 0) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_shortcut_exists));
                    } else if (m119404c == -1) {
                        throw new Exception("Cannot create shortcut");
                    }
                } else {
                    throw new Exception();
                }
                decodeResource.recycle();
                if (interfaceC27218a == null || interfaceC27218a.getContext() == null) {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (interfaceC27218a != null) {
                    ToastUtils.showMess(interfaceC27218a.getString(AbstractC8020f0.str_shortcut_mini_chat_create_fail));
                }
                if (interfaceC27218a == null || interfaceC27218a.getContext() == null) {
                    return;
                }
            }
            ((Vibrator) interfaceC27218a.getContext().getSystemService("vibrator")).vibrate(50L);
        } catch (Throwable th2) {
            if (interfaceC27218a != null && interfaceC27218a.getContext() != null) {
                ((Vibrator) interfaceC27218a.getContext().getSystemService("vibrator")).vibrate(50L);
            }
            throw th2;
        }
    }

    /* renamed from: c */
    public static int m119404c(Context context, ShortcutInfo shortcutInfo) {
        Object systemService;
        boolean isRequestPinShortcutSupported;
        List pinnedShortcuts;
        Intent createShortcutResultIntent;
        boolean requestPinShortcut;
        String id2;
        String id3;
        boolean updateShortcuts;
        systemService = context.getSystemService((Class<Object>) AbstractC26934p.m138753a());
        ShortcutManager m138754a = AbstractC26935q.m138754a(systemService);
        isRequestPinShortcutSupported = m138754a.isRequestPinShortcutSupported();
        if (isRequestPinShortcutSupported) {
            pinnedShortcuts = m138754a.getPinnedShortcuts();
            Iterator it = pinnedShortcuts.iterator();
            while (it.hasNext()) {
                id2 = AbstractC26927i.m138746a(it.next()).getId();
                id3 = shortcutInfo.getId();
                if (id2.equals(id3)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(shortcutInfo);
                    updateShortcuts = m138754a.updateShortcuts(arrayList);
                    if (!updateShortcuts) {
                        return -1;
                    }
                    return 0;
                }
            }
            createShortcutResultIntent = m138754a.createShortcutResultIntent(shortcutInfo);
            requestPinShortcut = m138754a.requestPinShortcut(shortcutInfo, PendingIntent.getBroadcast(context, 0, createShortcutResultIntent, AbstractC19601a.m102571a(0)).getIntentSender());
            if (requestPinShortcut) {
                return 2;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static void m119405d(InterfaceC27218a interfaceC27218a, String str, String str2, Bitmap bitmap, int i11) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || bitmap == null) {
            if (interfaceC27218a != null) {
                ToastUtils.showMess(interfaceC27218a.getString(AbstractC8020f0.str_shortcut_mini_chat_create_fail));
                return;
            }
            return;
        }
        try {
            try {
                int m118742r = AbstractC23136l9.m118742r(60.0f);
                int m118742r2 = AbstractC23136l9.m118742r(3.0f);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                Bitmap createBitmap = Bitmap.createBitmap(m118742r, m118742r, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int i12 = m118742r - m118742r2;
                canvas.drawBitmap(bitmap, (Rect) null, new Rect(m118742r2, m118742r2, i12, i12), paint);
                if (Build.VERSION.SDK_INT < 26) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.logozalo_headchat3);
                    canvas.drawBitmap(decodeResource, (Rect) null, new Rect(m118742r - decodeResource.getWidth(), m118742r - decodeResource.getHeight(), m118742r, m118742r), paint);
                    decodeResource.recycle();
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(CoreUtility.getAppContext(), "com.zing.zalo.ui.IntentHandlerActivityAlias"));
                    intent.setAction("com.zing.zalo.action.SHORTCUT_MINI_CHAT");
                    intent.putExtra("intent_sig", AbstractC23224t9.m119686a(intent));
                    intent.addFlags(268435456);
                    intent.addFlags(67108864);
                    intent.putExtra(ZinstantMetaConstant.TARGET_VIEWPORT, AbstractC19509c.m101979b(AESUtils.m39916b(CoreUtility.f89225a, str.getBytes())));
                    intent.putExtra("owner", AbstractC23352g.m122788d(String.valueOf(CoreUtility.f89233i)));
                    Intent intent2 = new Intent();
                    intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                    intent2.putExtra("android.intent.extra.shortcut.NAME", str2);
                    intent2.putExtra("android.intent.extra.shortcut.ICON", createBitmap);
                    intent2.putExtra("duplicate", false);
                    intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                    CoreUtility.getAppContext().sendBroadcast(intent2);
                    if (interfaceC27218a != null) {
                        if (!(interfaceC27218a instanceof ZaloActivity) && (interfaceC27218a instanceof C20052c)) {
                            C18922m.m99141t().m99143L();
                        }
                        Intent intent3 = new Intent("android.intent.action.MAIN");
                        intent3.addCategory("android.intent.category.HOME");
                        intent3.setFlags(268435456);
                        interfaceC27218a.startActivity(intent3);
                    }
                } else if (interfaceC27218a != null && interfaceC27218a.getContext() != null) {
                    if (i11 > 0) {
                        if (f112382a == null) {
                            C13704p1 c13704p1 = new C13704p1(1);
                            f112382a = c13704p1;
                            c13704p1.setTextSize(AbstractC23136l9.m118742r(13.0f));
                            f112382a.setColor(-1);
                            Paint paint2 = new Paint(1);
                            f112383b = paint2;
                            paint2.setColor(interfaceC27218a.getContext().getResources().getColor(AbstractC16801x.cNotify1));
                        }
                        String str3 = "";
                        if (i11 > 5) {
                            str3 = "5+";
                        } else if (i11 > 0) {
                            str3 = String.valueOf(i11);
                        }
                        int m118742r3 = AbstractC23136l9.m118742r(18.0f);
                        float f11 = m118742r3 / 2.0f;
                        int i13 = m118742r3 / 2;
                        int i14 = m118742r3 / 2;
                        int m118764y0 = i13 - (AbstractC23136l9.m118764y0(f112382a, str3) / 2);
                        int m118761x0 = (AbstractC23136l9.m118761x0(f112382a, str3) / 2) + i14;
                        canvas.drawCircle(i13, i14, f11, f112383b);
                        canvas.drawText(str3, m118764y0, m118761x0, f112382a);
                    }
                    int m119404c = m119404c(interfaceC27218a.getContext(), m119412k(interfaceC27218a.getContext(), str, createBitmap, str2, m119413l(interfaceC27218a.getContext(), str)));
                    if (m119404c == -1) {
                        throw new Exception("Cannot create shortcut");
                    }
                    if (m119404c == 0) {
                        ToastUtils.m89266n(AbstractC8020f0.str_shortcut_exists, new Object[0]);
                    } else {
                        ZaloBubbleActivity.m57031a5();
                    }
                } else {
                    throw new Exception();
                }
                bitmap.recycle();
                if (interfaceC27218a == null || interfaceC27218a.getContext() == null) {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                if (interfaceC27218a == null || interfaceC27218a.getContext() == null) {
                    return;
                }
            }
            ((Vibrator) interfaceC27218a.getContext().getSystemService("vibrator")).vibrate(50L);
        } catch (Throwable th2) {
            if (interfaceC27218a != null && interfaceC27218a.getContext() != null) {
                ((Vibrator) interfaceC27218a.getContext().getSystemService("vibrator")).vibrate(50L);
            }
            throw th2;
        }
    }

    /* renamed from: e */
    public static void m119406e(InterfaceC27218a interfaceC27218a, String str, String str2, Bitmap bitmap) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && bitmap != null) {
            try {
                try {
                    int m118742r = AbstractC23136l9.m118742r(60.0f);
                    int m118742r2 = AbstractC23136l9.m118742r(3.0f);
                    int m118742r3 = AbstractC23136l9.m118742r(25.0f);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    paint.setDither(true);
                    Bitmap createBitmap = Bitmap.createBitmap(m118742r, m118742r, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    int i11 = m118742r - m118742r2;
                    canvas.drawBitmap(bitmap, (Rect) null, new Rect(m118742r2, m118742r2, i11, i11), paint);
                    Bitmap decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.shortcut_call_callvoice);
                    int i12 = m118742r - m118742r3;
                    canvas.drawBitmap(decodeResource, (Rect) null, new Rect(0, i12, m118742r3, m118742r), paint);
                    decodeResource.recycle();
                    if (Build.VERSION.SDK_INT < 26) {
                        Bitmap decodeResource2 = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.shortcut_call_appicon);
                        canvas.drawBitmap(decodeResource2, (Rect) null, new Rect(i12, i12, m118742r, m118742r), paint);
                        decodeResource2.recycle();
                        Intent m119410i = m119410i(interfaceC27218a.getContext(), str);
                        Intent intent = new Intent();
                        intent.putExtra("android.intent.extra.shortcut.INTENT", m119410i);
                        intent.putExtra("android.intent.extra.shortcut.NAME", str2);
                        intent.putExtra("android.intent.extra.shortcut.ICON", createBitmap);
                        intent.putExtra("duplicate", false);
                        intent.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                        CoreUtility.getAppContext().sendBroadcast(intent);
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_shortcut_call_create_new));
                        if (interfaceC27218a instanceof C20052c) {
                            C18922m.m99141t().m99143L();
                        }
                        Intent intent2 = new Intent("android.intent.action.MAIN");
                        intent2.addCategory("android.intent.category.HOME");
                        intent2.setFlags(268435456);
                        interfaceC27218a.startActivity(intent2);
                    } else if (interfaceC27218a != null && interfaceC27218a.getContext() != null) {
                        int m119404c = m119404c(interfaceC27218a.getContext(), m119412k(interfaceC27218a.getContext(), String.format("call:%s", str), createBitmap, str2, m119410i(interfaceC27218a.getContext(), str)));
                        if (m119404c == 0) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_shortcut_call_create_exist));
                        } else if (m119404c == 1) {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_shortcut_call_create_new));
                        } else if (m119404c == 2) {
                            if (interfaceC27218a instanceof C20052c) {
                                C18922m.m99141t().m99143L();
                            }
                            ZaloBubbleActivity.m57031a5();
                        } else {
                            throw new Exception("Cannot create shortcut");
                        }
                    } else {
                        throw new Exception();
                    }
                    bitmap.recycle();
                    if (interfaceC27218a == null || interfaceC27218a.getContext() == null) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_shortcut_mini_chat_create_fail));
                    if (interfaceC27218a == null || interfaceC27218a.getContext() == null) {
                        return;
                    }
                }
                ((Vibrator) interfaceC27218a.getContext().getSystemService("vibrator")).vibrate(50L);
                return;
            } catch (Throwable th2) {
                if (interfaceC27218a != null && interfaceC27218a.getContext() != null) {
                    ((Vibrator) interfaceC27218a.getContext().getSystemService("vibrator")).vibrate(50L);
                }
                throw th2;
            }
        }
        if (interfaceC27218a != null) {
            ToastUtils.showMess(interfaceC27218a.getString(AbstractC8020f0.str_shortcut_mini_chat_create_fail));
        }
    }

    /* renamed from: f */
    public static void m119407f(InterfaceC27218a interfaceC27218a) {
        int i11;
        String m120039g = C23269y3.m120039g(AbstractC23136l9.m118755v0(AbstractC16775v.array_language_as_code));
        if (TextUtils.isEmpty(m120039g)) {
            m120039g = AbstractC18458a.f93019a;
        }
        String string = AbstractC23136l9.m118649F(new Locale(m120039g)).getString(AbstractC8020f0.qrcode_scan_qrcode);
        if (AbstractC21777d.m112314e() == 0) {
            i11 = AbstractC16803z.ic_shortcut_raster_qr;
        } else {
            i11 = AbstractC16803z.ic_shortcut_raster_dark_qr;
        }
        try {
            try {
                if (Build.VERSION.SDK_INT < 26) {
                    int m118742r = AbstractC23136l9.m118742r(60.0f);
                    int m118742r2 = AbstractC23136l9.m118742r(3.0f);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    paint.setDither(true);
                    Bitmap createBitmap = Bitmap.createBitmap(m118742r, m118742r, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Bitmap decodeResource = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), i11);
                    int i12 = m118742r - m118742r2;
                    canvas.drawBitmap(decodeResource, (Rect) null, new Rect(m118742r2, m118742r2, i12, i12), paint);
                    Bitmap decodeResource2 = BitmapFactory.decodeResource(MainApplication.getAppContext().getResources(), AbstractC16803z.logozalo_headchat3);
                    canvas.drawBitmap(decodeResource2, (Rect) null, new Rect(m118742r - decodeResource2.getWidth(), m118742r - decodeResource2.getHeight(), m118742r, m118742r), paint);
                    decodeResource2.recycle();
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(CoreUtility.getAppContext(), "com.zing.zalo.ui.IntentHandlerActivityAlias"));
                    intent.setAction("com.zing.zalo.action.SHORTCUT_SCAN_QRCODE");
                    intent.putExtra("intent_sig", AbstractC23224t9.m119686a(intent));
                    intent.addFlags(268435456);
                    intent.addFlags(67108864);
                    Intent intent2 = new Intent();
                    intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
                    intent2.putExtra("android.intent.extra.shortcut.NAME", string);
                    intent2.putExtra("android.intent.extra.shortcut.ICON", createBitmap);
                    intent2.putExtra("duplicate", false);
                    intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                    CoreUtility.getAppContext().sendBroadcast(intent2);
                    if (interfaceC27218a != null) {
                        ToastUtils.showMess(interfaceC27218a.getString(AbstractC8020f0.str_shortcut_mini_chat_create_success));
                        if (!(interfaceC27218a instanceof ZaloActivity) && (interfaceC27218a instanceof C20052c)) {
                            C18922m.m99141t().m99143L();
                        }
                        Intent intent3 = new Intent("android.intent.action.MAIN");
                        intent3.addCategory("android.intent.category.HOME");
                        intent3.setFlags(268435456);
                        interfaceC27218a.startActivity(intent3);
                    }
                    decodeResource.recycle();
                } else if (interfaceC27218a != null && interfaceC27218a.getContext() != null) {
                    Intent intent4 = new Intent();
                    intent4.setComponent(new ComponentName(interfaceC27218a.getContext(), "com.zing.zalo.ui.IntentHandlerActivityAlias"));
                    intent4.setAction("com.zing.zalo.action.SHORTCUT_SCAN_QRCODE");
                    intent4.putExtra("intent_sig", AbstractC23224t9.m119686a(intent4));
                    intent4.addFlags(268435456);
                    intent4.addFlags(67108864);
                    int m119404c = m119404c(interfaceC27218a.getContext(), m119411j(interfaceC27218a.getContext(), "SHORTCUT_ID_SCAN_QRCODE", i11, string, intent4));
                    if (m119404c == 0) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_shortcut_exists));
                    } else if (m119404c == -1) {
                        throw new Exception("Cannot create shortcut");
                    }
                } else {
                    throw new Exception();
                }
                if (interfaceC27218a == null || interfaceC27218a.getContext() == null) {
                    return;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
                ToastUtils.m89266n(AbstractC8020f0.str_shortcut_mini_chat_create_fail, new Object[0]);
                if (interfaceC27218a == null || interfaceC27218a.getContext() == null) {
                    return;
                }
            }
            ((Vibrator) interfaceC27218a.getContext().getSystemService("vibrator")).vibrate(50L);
        } catch (Throwable th2) {
            if (interfaceC27218a != null && interfaceC27218a.getContext() != null) {
                ((Vibrator) interfaceC27218a.getContext().getSystemService("vibrator")).vibrate(50L);
            }
            throw th2;
        }
    }

    /* renamed from: g */
    public static ShortcutInfo m119408g(Context context, String str, int i11, String str2, Intent intent) {
        ShortcutInfo.Builder activity;
        Icon createWithResource;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        ShortcutInfo.Builder intent2;
        ShortcutInfo build;
        AbstractC28113k6.m141600a();
        activity = AbstractC28033c6.m141471a(context, AbstractC23352g.m122788d(String.valueOf(str))).setActivity(new ComponentName(context, "com.zing.zalo.ui.SplashActivity"));
        createWithResource = Icon.createWithResource(context, i11);
        icon = activity.setIcon(createWithResource);
        shortLabel = icon.setShortLabel(str2);
        longLabel = shortLabel.setLongLabel(str2);
        intent2 = longLabel.setIntent(intent);
        build = intent2.build();
        return build;
    }

    /* renamed from: h */
    public static Intent m119409h(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.zing.zalo.ui.IntentHandlerActivityAlias"));
        intent.setAction("com.zing.zalo.action.SHORTCUT_CALENDAR");
        intent.putExtra("intent_sig", AbstractC23224t9.m119686a(intent));
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        return intent;
    }

    /* renamed from: i */
    public static Intent m119410i(Context context, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.zing.zalo.ui.IntentHandlerActivityAlias"));
        intent.setAction("com.zing.zalo.action.SHORTCUT_CALL");
        intent.putExtra("intent_sig", AbstractC23224t9.m119686a(intent));
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra(ZinstantMetaConstant.TARGET_VIEWPORT, AbstractC19509c.m101979b(AESUtils.m39916b(CoreUtility.f89225a, str.getBytes())));
        intent.putExtra("owner", AbstractC23352g.m122788d(String.valueOf(CoreUtility.f89233i)));
        return intent;
    }

    /* renamed from: j */
    public static ShortcutInfo m119411j(Context context, String str, int i11, String str2, Intent intent) {
        ShortcutInfo.Builder activity;
        Icon createWithResource;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        ShortcutInfo.Builder intent2;
        ShortcutInfo build;
        AbstractC28113k6.m141600a();
        activity = AbstractC28033c6.m141471a(context, AbstractC23352g.m122788d(String.valueOf(str))).setActivity(new ComponentName(context, "com.zing.zalo.ui.IntentHandlerActivityAlias"));
        createWithResource = Icon.createWithResource(context, i11);
        icon = activity.setIcon(createWithResource);
        shortLabel = icon.setShortLabel(str2);
        longLabel = shortLabel.setLongLabel(str2);
        intent2 = longLabel.setIntent(intent);
        build = intent2.build();
        return build;
    }

    /* renamed from: k */
    public static ShortcutInfo m119412k(Context context, String str, Bitmap bitmap, String str2, Intent intent) {
        ShortcutInfo.Builder activity;
        Icon createWithBitmap;
        ShortcutInfo.Builder icon;
        ShortcutInfo.Builder shortLabel;
        ShortcutInfo.Builder longLabel;
        ShortcutInfo.Builder intent2;
        ShortcutInfo build;
        AbstractC28113k6.m141600a();
        activity = AbstractC28033c6.m141471a(context, AbstractC23352g.m122788d(String.valueOf(str))).setActivity(new ComponentName(context, "com.zing.zalo.ui.IntentHandlerActivityAlias"));
        createWithBitmap = Icon.createWithBitmap(bitmap);
        icon = activity.setIcon(createWithBitmap);
        shortLabel = icon.setShortLabel(str2);
        longLabel = shortLabel.setLongLabel(str2);
        intent2 = longLabel.setIntent(intent);
        build = intent2.build();
        return build;
    }

    /* renamed from: l */
    public static Intent m119413l(Context context, String str) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.zing.zalo.ui.IntentHandlerActivityAlias"));
        intent.setAction("com.zing.zalo.action.SHORTCUT_MINI_CHAT");
        intent.putExtra("intent_sig", AbstractC23224t9.m119686a(intent));
        intent.addFlags(268435456);
        intent.addFlags(67108864);
        intent.putExtra(ZinstantMetaConstant.TARGET_VIEWPORT, AbstractC19509c.m101979b(AESUtils.m39916b(CoreUtility.f89225a, str.getBytes())));
        intent.putExtra("owner", AbstractC23352g.m122788d(String.valueOf(CoreUtility.f89233i)));
        return intent;
    }

    /* renamed from: m */
    public static boolean m119414m(Context context, String str) {
        Object systemService;
        boolean isRequestPinShortcutSupported;
        List pinnedShortcuts;
        String id2;
        systemService = context.getSystemService((Class<Object>) AbstractC26934p.m138753a());
        ShortcutManager m138754a = AbstractC26935q.m138754a(systemService);
        isRequestPinShortcutSupported = m138754a.isRequestPinShortcutSupported();
        if (!isRequestPinShortcutSupported) {
            return false;
        }
        String m122788d = AbstractC23352g.m122788d(String.format("call:%s", str));
        pinnedShortcuts = m138754a.getPinnedShortcuts();
        Iterator it = pinnedShortcuts.iterator();
        while (it.hasNext()) {
            id2 = AbstractC26927i.m138746a(it.next()).getId();
            if (id2.equals(m122788d)) {
                return true;
            }
        }
        return false;
    }
}
