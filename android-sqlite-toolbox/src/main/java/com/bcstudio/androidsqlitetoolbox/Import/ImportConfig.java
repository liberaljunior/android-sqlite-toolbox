package com.bcstudio.androidsqlitetoolbox.Import;

import android.util.Log;

import com.bcstudio.androidsqlitetoolbox.Componants.DbInteractionConfig;
import com.bcstudio.androidsqlitetoolbox.Constants;
import com.bcstudio.androidsqlitetoolbox.Database.DBHandler;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

public class ImportConfig extends DbInteractionConfig {
    public enum ImportType {
        JSON;
    }

    // Package variables
    DBHandler db;
    File srcFile;

    private ImportType importType;

    public ImportConfig(DBHandler database, File srcFile, ImportType importType) {
        this.srcFile = srcFile;
        this.db = database;
        this.importType = importType;
        this.databaseName = db.getDBName();
    }

    public ImportConfig(String databaseName, File srcFile, ImportType importType) {
        this.srcFile = srcFile;
        this.databaseName = databaseName;
        this.importType = importType;
    }
}
