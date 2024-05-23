package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.AbstractC1364q;
import androidx.core.content.C1390c;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p665y0.C30240b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.app.b1 */
/* loaded from: classes2.dex */
public class C1326b1 implements InterfaceC1362p {

    /* renamed from: a */
    private final Context f5884a;

    /* renamed from: b */
    private final Notification.Builder f5885b;

    /* renamed from: c */
    private final AbstractC1364q.f f5886c;

    /* renamed from: d */
    private RemoteViews f5887d;

    /* renamed from: e */
    private RemoteViews f5888e;

    /* renamed from: f */
    private final List f5889f = new ArrayList();

    /* renamed from: g */
    private final Bundle f5890g = new Bundle();

    /* renamed from: h */
    private int f5891h;

    /* renamed from: i */
    private RemoteViews f5892i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1326b1(AbstractC1364q.f fVar) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        List list;
        int i11;
        Notification.Builder badgeIconType;
        Notification.Builder settingsText;
        Notification.Builder shortcutId;
        Notification.Builder timeoutAfter;
        Icon icon;
        this.f5886c = fVar;
        this.f5884a = fVar.f6043a;
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1363p0.m6797a();
            this.f5885b = AbstractC1361o0.m6796a(fVar.f6043a, fVar.f6030K);
        } else {
            this.f5885b = new Notification.Builder(fVar.f6043a);
        }
        Notification notification = fVar.f6039T;
        Notification.Builder lights = this.f5885b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, fVar.f6051i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z11);
        if ((notification.flags & 8) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z12);
        if ((notification.flags & 16) != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z13).setDefaults(notification.defaults).setContentTitle(fVar.f6047e).setContentText(fVar.f6048f).setContentInfo(fVar.f6053k).setContentIntent(fVar.f6049g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = fVar.f6050h;
        if ((notification.flags & 128) != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z14).setLargeIcon(fVar.f6052j).setNumber(fVar.f6054l).setProgress(fVar.f6062t, fVar.f6063u, fVar.f6064v);
        this.f5885b.setSubText(fVar.f6059q).setUsesChronometer(fVar.f6057o).setPriority(fVar.f6055m);
        Iterator it = fVar.f6044b.iterator();
        while (it.hasNext()) {
            m6652b((AbstractC1364q.b) it.next());
        }
        Bundle bundle = fVar.f6023D;
        if (bundle != null) {
            this.f5890g.putAll(bundle);
        }
        int i12 = Build.VERSION.SDK_INT;
        this.f5887d = fVar.f6027H;
        this.f5888e = fVar.f6028I;
        this.f5885b.setShowWhen(fVar.f6056n);
        this.f5885b.setLocalOnly(fVar.f6068z).setGroup(fVar.f6065w).setGroupSummary(fVar.f6066x).setSortKey(fVar.f6067y);
        this.f5891h = fVar.f6035P;
        this.f5885b.setCategory(fVar.f6022C).setColor(fVar.f6024E).setVisibility(fVar.f6025F).setPublicVersion(fVar.f6026G).setSound(notification.sound, notification.audioAttributes);
        if (i12 < 28) {
            list = m6653e(m6654g(fVar.f6045c), fVar.f6042W);
        } else {
            list = fVar.f6042W;
        }
        if (list != null && !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                this.f5885b.addPerson((String) it2.next());
            }
        }
        this.f5892i = fVar.f6029J;
        if (fVar.f6046d.size() > 0) {
            Bundle bundle2 = fVar.m6884j().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i13 = 0; i13 < fVar.f6046d.size(); i13++) {
                bundle4.putBundle(Integer.toString(i13), AbstractC1329c1.m6666a((AbstractC1364q.b) fVar.f6046d.get(i13)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            fVar.m6884j().putBundle("android.car.EXTENSIONS", bundle2);
            this.f5890g.putBundle("android.car.EXTENSIONS", bundle3);
        }
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 23 && (icon = fVar.f6041V) != null) {
            this.f5885b.setSmallIcon(icon);
        }
        if (i14 >= 24) {
            this.f5885b.setExtras(fVar.f6023D).setRemoteInputHistory(fVar.f6061s);
            RemoteViews remoteViews = fVar.f6027H;
            if (remoteViews != null) {
                this.f5885b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = fVar.f6028I;
            if (remoteViews2 != null) {
                this.f5885b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = fVar.f6029J;
            if (remoteViews3 != null) {
                this.f5885b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i14 >= 26) {
            badgeIconType = this.f5885b.setBadgeIconType(fVar.f6031L);
            settingsText = badgeIconType.setSettingsText(fVar.f6060r);
            shortcutId = settingsText.setShortcutId(fVar.f6032M);
            timeoutAfter = shortcutId.setTimeoutAfter(fVar.f6034O);
            timeoutAfter.setGroupAlertBehavior(fVar.f6035P);
            if (fVar.f6021B) {
                this.f5885b.setColorized(fVar.f6020A);
            }
            if (!TextUtils.isEmpty(fVar.f6030K)) {
                this.f5885b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i14 >= 28) {
            Iterator it3 = fVar.f6045c.iterator();
            while (it3.hasNext()) {
                this.f5885b.addPerson(((C1341g1) it3.next()).m6734h());
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 29) {
            this.f5885b.setAllowSystemGeneratedContextualActions(fVar.f6037R);
            this.f5885b.setBubbleMetadata(AbstractC1364q.e.m6829j(fVar.f6038S));
            C1390c c1390c = fVar.f6033N;
            if (c1390c != null) {
                this.f5885b.setLocusId(c1390c.m6996b());
            }
        }
        if (i15 >= 31 && (i11 = fVar.f6036Q) != 0) {
            this.f5885b.setForegroundServiceBehavior(i11);
        }
        if (fVar.f6040U) {
            if (this.f5886c.f6066x) {
                this.f5891h = 2;
            } else {
                this.f5891h = 1;
            }
            this.f5885b.setVibrate(null);
            this.f5885b.setSound(null);
            int i16 = notification.defaults & (-4);
            notification.defaults = i16;
            this.f5885b.setDefaults(i16);
            if (i15 >= 26) {
                if (TextUtils.isEmpty(this.f5886c.f6065w)) {
                    this.f5885b.setGroup("silent");
                }
                this.f5885b.setGroupAlertBehavior(this.f5891h);
            }
        }
    }

    /* renamed from: b */
    private void m6652b(AbstractC1364q.b bVar) {
        Notification.Action.Builder builder;
        int i11;
        Bundle bundle;
        Icon icon;
        int i12 = Build.VERSION.SDK_INT;
        IconCompat m6802d = bVar.m6802d();
        if (i12 >= 23) {
            AbstractC1340g0.m6726a();
            if (m6802d != null) {
                icon = m6802d.m7167s();
            } else {
                icon = null;
            }
            builder = AbstractC1337f0.m6716a(icon, bVar.m6806h(), bVar.m6799a());
        } else {
            if (m6802d != null) {
                i11 = m6802d.m7159k();
            } else {
                i11 = 0;
            }
            builder = new Notification.Action.Builder(i11, bVar.m6806h(), bVar.m6799a());
        }
        if (bVar.m6803e() != null) {
            for (RemoteInput remoteInput : C1347i1.m6750b(bVar.m6803e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (bVar.m6801c() != null) {
            bundle = new Bundle(bVar.m6801c());
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.m6800b());
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 24) {
            builder.setAllowGeneratedReplies(bVar.m6800b());
        }
        bundle.putInt("android.support.action.semanticAction", bVar.m6804f());
        if (i13 >= 28) {
            builder.setSemanticAction(bVar.m6804f());
        }
        if (i13 >= 29) {
            builder.setContextual(bVar.m6808j());
        }
        if (i13 >= 31) {
            builder.setAuthenticationRequired(bVar.m6807i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.m6805g());
        builder.addExtras(bundle);
        this.f5885b.addAction(builder.build());
    }

    /* renamed from: e */
    private static List m6653e(List list, List list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        C30240b c30240b = new C30240b(list.size() + list2.size());
        c30240b.addAll(list);
        c30240b.addAll(list2);
        return new ArrayList(c30240b);
    }

    /* renamed from: g */
    private static List m6654g(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1341g1) it.next()).m6733g());
        }
        return arrayList;
    }

    /* renamed from: h */
    private void m6655h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // androidx.core.app.InterfaceC1362p
    /* renamed from: a */
    public Notification.Builder mo6656a() {
        return this.f5885b;
    }

    /* renamed from: c */
    public Notification m6657c() {
        RemoteViews remoteViews;
        Bundle m6798a;
        RemoteViews m6918f;
        RemoteViews m6916d;
        AbstractC1364q.j jVar = this.f5886c.f6058p;
        if (jVar != null) {
            jVar.mo6815b(this);
        }
        if (jVar != null) {
            remoteViews = jVar.m6917e(this);
        } else {
            remoteViews = null;
        }
        Notification m6658d = m6658d();
        if (remoteViews != null) {
            m6658d.contentView = remoteViews;
        } else {
            RemoteViews remoteViews2 = this.f5886c.f6027H;
            if (remoteViews2 != null) {
                m6658d.contentView = remoteViews2;
            }
        }
        if (jVar != null && (m6916d = jVar.m6916d(this)) != null) {
            m6658d.bigContentView = m6916d;
        }
        if (jVar != null && (m6918f = this.f5886c.f6058p.m6918f(this)) != null) {
            m6658d.headsUpContentView = m6918f;
        }
        if (jVar != null && (m6798a = AbstractC1364q.m6798a(m6658d)) != null) {
            jVar.mo6827a(m6798a);
        }
        return m6658d;
    }

    /* renamed from: d */
    protected Notification m6658d() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            return this.f5885b.build();
        }
        if (i11 >= 24) {
            Notification build = this.f5885b.build();
            if (this.f5891h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f5891h == 2) {
                    m6655h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f5891h == 1) {
                    m6655h(build);
                }
            }
            return build;
        }
        this.f5885b.setExtras(this.f5890g);
        Notification build2 = this.f5885b.build();
        RemoteViews remoteViews = this.f5887d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f5888e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f5892i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f5891h != 0) {
            if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f5891h == 2) {
                m6655h(build2);
            }
            if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f5891h == 1) {
                m6655h(build2);
            }
        }
        return build2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m6659f() {
        return this.f5884a;
    }
}
