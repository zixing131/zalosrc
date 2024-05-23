package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f5868a = (IconCompat) versionedParcel.m11149v(remoteActionCompat.f5868a, 1);
        remoteActionCompat.f5869b = versionedParcel.m11139l(remoteActionCompat.f5869b, 2);
        remoteActionCompat.f5870c = versionedParcel.m11139l(remoteActionCompat.f5870c, 3);
        remoteActionCompat.f5871d = (PendingIntent) versionedParcel.m11145r(remoteActionCompat.f5871d, 4);
        remoteActionCompat.f5872e = versionedParcel.m11135h(remoteActionCompat.f5872e, 5);
        remoteActionCompat.f5873f = versionedParcel.m11135h(remoteActionCompat.f5873f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.m11151x(false, false);
        versionedParcel.m11130M(remoteActionCompat.f5868a, 1);
        versionedParcel.m11121D(remoteActionCompat.f5869b, 2);
        versionedParcel.m11121D(remoteActionCompat.f5870c, 3);
        versionedParcel.m11125H(remoteActionCompat.f5871d, 4);
        versionedParcel.m11153z(remoteActionCompat.f5872e, 5);
        versionedParcel.m11153z(remoteActionCompat.f5873f, 6);
    }
}
