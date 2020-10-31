package org.armstrong.ika.digitalbibleapp.Versions;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import org.armstrong.ika.digitalbibleapp.Versions.DB.VersionsEntities;
import org.armstrong.ika.digitalbibleapp.Versions.DB.VersionsRepository;

import java.util.List;

public class VersionsViewModel extends AndroidViewModel {

    private VersionsRepository versionsRepository;

    private LiveData<List<VersionsEntities>> allActiveVersions, allVersions;

    public VersionsViewModel(Application application) {
        super(application);
        versionsRepository = new VersionsRepository(application);
    }

    public LiveData<List<VersionsEntities>> getActiveVersions(int number) {
        allActiveVersions = versionsRepository.getActiveVersions(number);
        return allActiveVersions;
    }

//    public LiveData<List<VersionEntities>> getAllVersions() {
//        allVersions = versionRepository.getAllVersions();
//        return allVersions;
//    }

}